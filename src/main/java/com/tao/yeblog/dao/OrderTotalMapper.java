package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.OrderChartsDTO;
import com.tao.yeblog.model.qo.OrderChartsQO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单量统计Mapper
 */
@Mapper
public interface OrderTotalMapper {

    /**
     * 通过年获取订单量
     * @param orderChartsQO
     * @return
     */
    List<OrderChartsDTO> getOrderCountByYear(OrderChartsQO orderChartsQO);

    /**
     * 通过月获取订单量
     * @param orderChartsQO
     * @return
     */
    List<OrderChartsDTO> getOrderCountByMonth(OrderChartsQO orderChartsQO);

    /**
     * 通过天获取订单量
     * @param orderChartsQO
     * @return
     */
    List<OrderChartsDTO> getOrderCountByDay(OrderChartsQO orderChartsQO);
}
