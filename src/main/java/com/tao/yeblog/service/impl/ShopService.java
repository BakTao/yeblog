package com.tao.yeblog.service.impl;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.dao.ShopMapper;
import com.tao.yeblog.model.dto.ShopDTO;
import com.tao.yeblog.model.qo.ShopQO;
import com.tao.yeblog.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService implements IShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public IPage<ShopDTO> pageShopInfo(ShopQO shopQO) {
        return shopMapper.pageShopInfo(shopQO);
    }
}
