package com.tao.yeblog.dao;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.ColumnDTO;
import com.tao.yeblog.model.qo.ColumnQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 专栏管理Mapper
 */
@Mapper
public interface ColumnMapper {

    /**
     * 获取专栏信息
     * @param columnQO
     * @return
     */
    IPage<ColumnDTO> pageColumnInfo(ColumnQO columnQO);

    /**
     * 增加专栏信息
     * @param columnDTO
     * @return
     */
    void createColumnInfo(ColumnDTO columnDTO);

}
