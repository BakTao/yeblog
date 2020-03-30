package com.tao.yeblog.service.impl;

import com.tao.yeblog.dao.BlogTotalMapper;
import com.tao.yeblog.dao.RegisterTotalMapper;
import com.tao.yeblog.model.dto.BlogChartsDTO;
import com.tao.yeblog.model.dto.RegisterChartsDTO;
import com.tao.yeblog.model.qo.BlogChartsQO;
import com.tao.yeblog.model.qo.RegisterChartsQO;
import com.tao.yeblog.service.IDataTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTotalService implements IDataTotalService {

    @Autowired
    private RegisterTotalMapper registerTotalMapper;

    @Autowired
    private BlogTotalMapper blogTotalMapper;

    @Override
    public List<RegisterChartsDTO> getRegisterCount(RegisterChartsQO registerChartsQO) {
        if("1".equals(registerChartsQO.getSjwd())){
            return registerTotalMapper.getRegisterCountByYear(registerChartsQO);
        }else if("2".equals(registerChartsQO.getSjwd())){
            return registerTotalMapper.getRegisterCountByMonth(registerChartsQO);
        }else{
            return registerTotalMapper.getRegisterCountByDay(registerChartsQO);
        }
    }

    @Override
    public List<BlogChartsDTO> getBlogCountBylx(BlogChartsQO blogChartsQO) {
        if("1".equals(blogChartsQO.getSjwd())){
            return blogTotalMapper.getBlogCountBylxByYear(blogChartsQO);
        }else if("2".equals(blogChartsQO.getSjwd())){
            return blogTotalMapper.getBlogCountBylxByMonth(blogChartsQO);
        }else{
            return blogTotalMapper.getBlogCountBylxByDay(blogChartsQO);
        }
    }

    @Override
    public List<BlogChartsDTO> getBlogCountByyx(BlogChartsQO blogChartsQO) {
        if(blogChartsQO.getBlogType() != null && !"".equals(blogChartsQO.getBlogType())){
            blogChartsQO.setBlogTypes(blogChartsQO.getBlogType().split(","));
        }
        if("1".equals(blogChartsQO.getSjwd())){
            return blogTotalMapper.getBlogCountByyxByYear(blogChartsQO);
        }else if("2".equals(blogChartsQO.getSjwd())){
            return blogTotalMapper.getBlogCountByyxByMonth(blogChartsQO);
        }else{
            return blogTotalMapper.getBlogCountByyxByDay(blogChartsQO);
        }
    }

    @Override
    public List<BlogChartsDTO> getBlogCountByColumn(BlogChartsQO blogChartsQO) {
        if(blogChartsQO.getColumnId() != null && !"".equals(blogChartsQO.getColumnId())){
            blogChartsQO.setColumnIds(blogChartsQO.getColumnId().split(","));
        }
        return blogTotalMapper.getBlogCountByColumn(blogChartsQO);

    }
}
