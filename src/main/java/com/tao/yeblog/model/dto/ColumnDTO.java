package com.tao.yeblog.model.dto;

import lombok.Data;

/**
 * 专栏信息DTO
 */
@Data
public class ColumnDTO {

    private String name;    //名字

    private String columnId; //专栏Id

    private String blogCount; //博客数量

}
