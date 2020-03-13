package com.tao.yeblog.service.impl;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.dao.OrderMapper;
import com.tao.yeblog.model.dto.OrderDTO;
import com.tao.yeblog.model.qo.OrderQO;
import com.tao.yeblog.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IPage<OrderDTO> pageOrderInfo(OrderQO orderQO) {
        return orderMapper.pageOrderInfo(orderQO);
    }
}
