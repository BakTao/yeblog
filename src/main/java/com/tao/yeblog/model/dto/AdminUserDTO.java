package com.tao.yeblog.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.yeblog.common.BasePage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminUserDTO extends BasePage {
    private String loginId;     //登录id

    private String password;    //密码

    private String name;        //名称

    private String lastLogIp;   //上次登录ip

    private String lastLogTime; //上次登录时间

    private String userPhoto;   //头像

    private String token;       //登录令牌



}
