package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.ShopDTO;
import com.tao.yeblog.model.qo.ShopQO;

/**
 * 商城管理Service
 */
public interface IShopService {

    /**
     * 获取商品信息
     * @param shopQO
     * @return
     */
    IPage<ShopDTO> pageShopInfo(ShopQO shopQO);
}
