package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.OrderChartsDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单量统计Mapper
 */
@Mapper
public interface OrderTotalMapper {

    /**
     * 通过年获取订单量
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderCountByYear();

    /**
     * 通过月获取订单量
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderCountByMonth();

    /**
     * 通过天获取订单量
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderCountByDay();

    /**
     * 通过年获取订单金额
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderMoneyByYear();

    /**
     * 通过月获取订单金额
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderMoneyByMonth();

    /**
     * 通过天获取订单金额
     * @param
     * @return
     */
    List<OrderChartsDTO> getOrderMoneyByDay();
}
