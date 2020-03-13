package com.tao.yeblog.dao;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.OrderDTO;
import com.tao.yeblog.model.qo.OrderQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单管理Mapper
 */
@Mapper
public interface OrderMapper {

    /**
     * 获取订单信息
     * @param orderQO
     * @return
     */
    IPage<OrderDTO> pageOrderInfo(OrderQO orderQO);


}
