package com.tao.yeblog.rest;

import com.tao.yeblog.common.JwtUtils;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.AdminUserDTO;
import com.tao.yeblog.service.IAdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/back/loginServices")
public class AmdinLoginController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private IAdminLoginService adminLoginService;

    @PostMapping("/adminLogin")
    public Response<AdminUserDTO> login(@RequestBody AdminUserDTO adminUser){
        AdminUserDTO adminUserDTO = adminLoginService.getAdminUserInfo(adminUser);

        String token = jwtUtils.getToken(adminUserDTO.getLoginId(), adminUserDTO.getName(), new HashMap<>());

        adminUserDTO.setToken(token);

        return Response.successData(adminUserDTO);
    }


    @PostMapping("/test")
    public Response<AdminUserDTO> test(@RequestBody AdminUserDTO adminUser){

        return Response.successData(adminUser);
    }


}
