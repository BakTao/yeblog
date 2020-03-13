package com.tao.yeblog.model.qo;

import com.tao.yeblog.common.BasePage;
import lombok.Data;

/**
 * 商城信息QO
 */
@Data
public class ShopQO extends BasePage {

    private String name;    //名字

    private String goodsId; //商品Id

    private String nums;     //数量

    private String buyNums;     //购买数量

    private String price;   //价格

    private String photo;   //图片

    private String type;   //类型

    private String content;   //商品介绍


}
