package com.tao.yeblog.model.dto;

import lombok.Data;

/**
 * 订单信息DTO
 */
@Data
public class OrderDTO {

    private String orderId;     //订单id

    private String userId;    //购买人id

    private String userName;    //购买人名称

    private String price;       //总价格

    private String enable;     //是否有效

    private String createTime;   //创建时间

    private String address;   //地址

    private String remark;   //备注

}
