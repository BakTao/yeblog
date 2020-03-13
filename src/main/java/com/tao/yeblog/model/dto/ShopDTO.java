package com.tao.yeblog.model.dto;

import lombok.Data;

/**
 * 商城信息DTO
 */
@Data
public class ShopDTO {

    private String name;    //名字

    private String goodsId; //商品Id

    private String nums;     //数量

    private String buyNums;     //购买数量

    private String price;   //价格

    private String photo;   //图片

    private String type;   //类型

    private String content;   //商品介绍

}
