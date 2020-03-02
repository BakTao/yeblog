package com.tao.yeblog.rest;

import com.tao.yeblog.common.JwtUtils;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.AdminUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/back/userServices")
public class AmdinLoginController {

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/adminLogin")

    public Response<AdminUserDTO> login(@RequestBody AdminUserDTO adminUser){
        String loginId = adminUser.getLoginId();
        //String name = adminUser.getName();

        String token = jwtUtils.getToken(loginId, "admin", new HashMap<>());

        AdminUserDTO adminUserDTO = new AdminUserDTO();

        adminUserDTO.setToken(token);

        return Response.successData(adminUserDTO);
    }


    @PostMapping("/test")
    public Response<AdminUserDTO> test(@RequestBody AdminUserDTO adminUser){

        return Response.successData(adminUser);
    }


}
