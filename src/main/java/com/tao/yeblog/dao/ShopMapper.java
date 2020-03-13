package com.tao.yeblog.dao;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.ShopDTO;
import com.tao.yeblog.model.qo.ShopQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商城管理Mapper
 */
@Mapper
public interface ShopMapper {

    /**
     * 获取商品信息
     * @param shopQO
     * @return
     */
    IPage<ShopDTO> pageShopInfo(ShopQO shopQO);

    /**
     * 更新商品信息
     * @param shopDTO
     * @return
     */
    void updateShopInfo(ShopDTO shopDTO);

    /**
     * 新增商品信息
     * @param shopDTO
     * @return
     */
    void createShopInfo(ShopDTO shopDTO);

}
