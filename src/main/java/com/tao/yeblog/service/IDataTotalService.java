package com.tao.yeblog.service;

import com.tao.yeblog.model.dto.BlogChartsDTO;
import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.BlogChartsQO;
import com.tao.yeblog.model.qo.RegisterChartsQO;

import java.util.List;

/**
 * 数据统计Service
 */
public interface IDataTotalService {

    /**
     * 获取注册量
     * @param registerChartsQO
     * @return
     */
    List<RegisterChartsDTO> getRegisterCount(RegisterChartsQO registerChartsQO);

    /**
     * 获取博客量(按博客类型)
     * @param blogChartsQO
     * @return
     */
    List<BlogChartsDTO> getBlogCountBylx(BlogChartsQO blogChartsQO);

    /**
     * 获取博客量(按是否有效)
     * @param blogChartsQO
     * @return
     */
    List<BlogChartsDTO> getBlogCountByyx(BlogChartsQO blogChartsQO);

    /**
     * 获取博客量(按专栏名称)
     * @param blogChartsQO
     * @return
     */
    List<BlogChartsDTO> getBlogCountByColumn(BlogChartsQO blogChartsQO);
}
