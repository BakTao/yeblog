package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.ColumnDTO;
import com.tao.yeblog.model.qo.ColumnQO;

/**
 * 专栏管理Service
 */
public interface IColumnService {

    /**
     * 获取专栏信息
     * @param columnQO
     * @return
     */
    IPage<ColumnDTO> pageColumnInfo(ColumnQO columnQO);
}
