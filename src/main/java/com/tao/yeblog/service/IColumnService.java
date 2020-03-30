package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.ColumnDTO;
import com.tao.yeblog.model.dto.SelectDTO;
import com.tao.yeblog.model.qo.ColumnQO;

import java.util.List;

/**
 * 专栏管理Service
 */
public interface IColumnService {

    /**
     * 获取专栏信息(分页)
     * @param columnQO
     * @return
     */
    IPage<ColumnDTO> pageColumnInfo(ColumnQO columnQO);

    /**
     * 获取专栏信息
     * @param columnQO
     * @return
     */
    List<SelectDTO> listColumnInfo(ColumnQO columnQO);

    /**
     * 获取专栏信息(包含全部)
     * @param columnQO
     * @return
     */
    List<SelectDTO> listColumnInfoAll(ColumnQO columnQO);

    /**
     * 增加专栏信息
     * @param columnDTO
     * @return
     */
    String createColumn(ColumnDTO columnDTO);

    /**
     * 更新专栏信息
     * @param columnDTO
     * @return
     */
    String updateColumnInfo(ColumnDTO columnDTO);

    /**
     * 删除专栏信息
     * @param columnDTO
     * @return
     */
    String deleteColumn(ColumnDTO columnDTO);
}
