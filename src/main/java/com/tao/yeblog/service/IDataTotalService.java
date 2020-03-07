package com.tao.yeblog.service;

import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.RegisterChartsQO;

import java.util.List;

public interface IDataTotalService {

    /**
     * 获取注册量
     * @param registerChartsQO
     * @return
     */
    List<RegisterChartsDTO> getRegisterCount(RegisterChartsQO registerChartsQO);
}
