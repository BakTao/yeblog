package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;
import com.tao.yeblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/back/userServices")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 获取用户信息
     * @param userQO
     * @return
     */
    @RequestMapping("/pageUserInfo")
    public Response<IPage<UserDTO>> pageUserInfo(UserQO userQO){
        return Response.successData(userService.pageUserInfo(userQO));
    }
}
