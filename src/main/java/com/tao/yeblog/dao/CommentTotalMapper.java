package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.CommentChartsDTO;
import com.tao.yeblog.model.qo.CommentChartsQO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 注册量统计Mapper
 */
@Mapper
public interface CommentTotalMapper {

    /**
     * 通过年获取注册量
     * @param commentChartsQO
     * @return
     */
    List<CommentChartsDTO> getCommentCountByYear(CommentChartsQO commentChartsQO);

    /**
     * 通过月获取注册量
     * @param commentChartsQO
     * @return
     */
    List<CommentChartsDTO> getCommentCountByMonth(CommentChartsQO commentChartsQO);

    /**
     * 通过天获取注册量
     * @param commentChartsQO
     * @return
     */
    List<CommentChartsDTO> getCommentCountByDay(CommentChartsQO commentChartsQO);
}
