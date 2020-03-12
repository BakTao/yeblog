package com.tao.yeblog.rest;

import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.RegisterChartsQO;
import com.tao.yeblog.service.IDataTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 数据统计Controller
 */
@RestController
@RequestMapping("/back/dataTotal")
public class DataTotalContorller {

    @Autowired
    private IDataTotalService dataTotalService;

    /**
     * 获取注册量
     * @param registerChartsQO
     * @return
     */
    @PostMapping("/getRegisterCount")
    public Response<List<RegisterChartsDTO>> getRegisterCount(@RequestBody RegisterChartsQO registerChartsQO){
        return Response.successData(dataTotalService.getRegisterCount(registerChartsQO));
    }

}
