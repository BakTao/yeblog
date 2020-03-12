package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.RegisterChartsQO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单管理Mapper
 */
@Mapper
public interface OrderMapper {

    /**
     * 通过年获取注册量
     * @param registerChartsQO
     * @return
     */
    List<RegisterChartsDTO> getRegisterCountByYear(RegisterChartsQO registerChartsQO);

    /**
     * 通过月获取注册量
     * @param registerChartsQO
     * @return
     */
    List<RegisterChartsDTO> getRegisterCountByMonth(RegisterChartsQO registerChartsQO);

    /**
     * 通过天获取注册量
     * @param registerChartsQO
     * @return
     */
    List<RegisterChartsDTO> getRegisterCountByDay(RegisterChartsQO registerChartsQO);
}
