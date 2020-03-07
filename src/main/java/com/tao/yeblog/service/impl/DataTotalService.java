package com.tao.yeblog.service.impl;

import com.tao.yeblog.dao.DataTotalMapper;
import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.RegisterChartsQO;
import com.tao.yeblog.service.IDataTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTotalService implements IDataTotalService {

    @Autowired
    private DataTotalMapper dataTotalMapper;

    @Override
    public List<RegisterChartsDTO> getRegisterCount(RegisterChartsQO registerChartsQO) {
        if("1".equals(registerChartsQO.getSjwd())){
            return dataTotalMapper.getRegisterCountByYear(registerChartsQO);
        }else if("2".equals(registerChartsQO.getSjwd())){
            List<RegisterChartsDTO> list = dataTotalMapper.getRegisterCountByMonth(registerChartsQO);
            return dataTotalMapper.getRegisterCountByMonth(registerChartsQO);
        }else{
            return dataTotalMapper.getRegisterCountByDay(registerChartsQO);
        }
    }
}
