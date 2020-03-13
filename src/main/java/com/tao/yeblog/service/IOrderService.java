package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.OrderDTO;
import com.tao.yeblog.model.qo.OrderQO;

/**
 * 订单管理Service
 */
public interface IOrderService {

    /**
     * 获取订单信息
     * @param orderQO
     * @return
     */
    IPage<OrderDTO> pageOrderInfo(OrderQO orderQO);
}
