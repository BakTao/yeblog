package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.ShopDTO;
import com.tao.yeblog.model.qo.ShopQO;
import com.tao.yeblog.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商城管理Controller
 */
@RestController
@RequestMapping("/back/shopServices")
public class ShopController {

    @Autowired
    private IShopService shopService;

    /**
     * 获取商品信息
     * @param shopQO
     * @return
     */
    @RequestMapping("/pageShopInfo")
    public Response<IPage<ShopDTO>> pageShopInfo(ShopQO shopQO){
        return Response.successData(shopService.pageShopInfo(shopQO));
    }
}
