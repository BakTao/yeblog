package com.tao.yeblog.rest;

import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.AdminUserDTO;
import com.tao.yeblog.service.IAdminLoginService;
import com.tao.yeblog.utils.IpUtil;
import com.tao.yeblog.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@RequestMapping("/back/loginServices")
public class AmdinLoginController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private IAdminLoginService adminLoginService;

    @PostMapping("/adminLogin")
    public Response<AdminUserDTO> login(@RequestBody AdminUserDTO adminUser, HttpServletRequest request){
        //通过用户名和密码获得用户信息
        AdminUserDTO adminUserDTO = adminLoginService.getAdminUserInfo(adminUser);

        //用户名和密码错误
        if(adminUserDTO == null){
            return new Response<>("601", "用户名或密码有误,请重新输入");
        }

        //更新ip和时间
        String ip = IpUtil.getIpAddr(request);
        AdminUserDTO updateInfo = new AdminUserDTO();
        updateInfo.setLogIp(ip);
        updateInfo.setLogTime("update");
        updateInfo.setLoginId(adminUser.getLoginId());
        updateInfo.setPassword(adminUser.getPassword());
        adminLoginService.updateAdminUserInfo(updateInfo);

        //获取token
        String token = jwtUtil.getToken(adminUserDTO.getLoginId(), adminUserDTO.getName(), new HashMap<>());
        adminUserDTO.setToken(token);

        return Response.successData(adminUserDTO);
    }


    @RequestMapping("/test")
    public Response<String> test(HttpServletRequest request){

        return Response.successData(IpUtil.getIpAddr(request));
    }


}
