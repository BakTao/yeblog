package com.tao.yeblog.model.dto;

import lombok.Data;

/**
 * 博客信息DTO
 */
@Data
public class BlogDTO {

    private String blogId;  //博客id

    private String userId; //用户Id

    private String userName; //用户名称

    private String columnId; //专栏id

    private String columnName; //专栏名称

    private String title;   //标题

    private String type;   //类型

    private String content; //内容

    private String cover; //封面

    private String enable; //是否有效

}
