package com.tao.yeblog.model.dto;

import lombok.Data;

/**
 * 用户信息DTO
 */
@Data
public class UserDTO {

    private String name;    //名字

    private String loginId; //登录Id

    private String password; //密码

    private String sex;     //性别

    private String phone;   //手机号码

    private String email;   //邮箱

    private String lastLogIp;   //上次登录ip

    private String lastLogTime; //上次登录时间

    private String userPhoto; //头像

    private String regTime; //注册时间

    private String enable; //是否有效

    private String reason; //失效原因

    private String blogCountHj; //博客数量(合计)

    private String blogCount; //博客数量

    private String ownBlogCount; //原创博客数量

    private String noOwnBlogCount; //转载博客数量

    private String testBlogCount; //草稿博客数量

    private String unableTime; //解禁时间

    private String unableDay;   //封禁时间

    private String collectionNums;   //收藏数

    private String commentNumsHj;   //评论数

    private String commentPraiseNums;   //评论点赞数

}
