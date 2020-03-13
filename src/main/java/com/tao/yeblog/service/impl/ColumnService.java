package com.tao.yeblog.service.impl;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.dao.ColumnMapper;
import com.tao.yeblog.model.dto.ColumnDTO;
import com.tao.yeblog.model.qo.ColumnQO;
import com.tao.yeblog.service.IColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColumnService implements IColumnService {

    @Autowired
    private ColumnMapper columnMapper;

    @Override
    public IPage<ColumnDTO> pageColumnInfo(ColumnQO columnQO) {
        return columnMapper.pageColumnInfo(columnQO);
    }
}
