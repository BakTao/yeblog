package com.tao.yeblog.model.dto;

import lombok.Data;

@Data
public class UserDTO {

    private String name;    //名字

    private String loginId; //登录Id

    private String sex;     //性别

    private String phone;   //手机号码

    private String email;   //邮箱

    private String lastLogIp;   //上次登录ip

    private String lastLogTime; //上次登录时间

    private String userPhoto; //头像

    private String regTime; //注册时间

    private String enable; //是否有效

    private String reason; //失效原因

    private String blogCount; //博客数量

}