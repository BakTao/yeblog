package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.ColumnDTO;
import com.tao.yeblog.model.qo.ColumnQO;
import com.tao.yeblog.service.IColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 专栏管理Controller
 */
@RestController
@RequestMapping("/back/columnServices")
public class ColumnController {

    @Autowired
    private IColumnService columnService;

    /**
     * 获取专栏信息
     * @param columnQO
     * @return
     */
    @PostMapping("/pageColumnInfo")
    public Response<IPage<ColumnDTO>> pageColumnInfo(ColumnQO columnQO){
        return Response.successData(columnService.pageColumnInfo(columnQO));
    }
}