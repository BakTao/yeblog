package com.tao.yeblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.PageDefaultImpl;
import com.tao.yeblog.common.Pager;
import com.tao.yeblog.dao.BlogMapper;
import com.tao.yeblog.model.dto.BlogDTO;
import com.tao.yeblog.model.qo.BlogQO;
import com.tao.yeblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements  IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public IPage<BlogDTO> pageBlogInfo(BlogQO blogQO) {
        if(blogQO.getType() != null && !"".equals(blogQO.getType())){
            blogQO.setTypes(blogQO.getType().split(","));
        }
        if(blogQO.getColumnId() != null && !"".equals(blogQO.getColumnId())){
            blogQO.setColumnIds(blogQO.getColumnId().split(","));
        }

        PageDefaultImpl<BlogDTO> page = new PageDefaultImpl<>();

        PageHelper.startPage(blogQO.getPageIndex(),blogQO.getPageSize());
        PageInfo<BlogDTO> pageInfo = new PageInfo<>(blogMapper.pageBlogInfo(blogQO));

        Pager pager = new Pager();
        pager.setPageIndex(pageInfo.getPageNum());
        pager.setPageSize(pageInfo.getPageSize());
        pager.setPageCount(pageInfo.getPages());
        pager.setRecordCount(pageInfo.getTotal());
        pager.setPrePageIndex(pageInfo.getPrePage());
        pager.setNextPageIndex(pageInfo.getNextPage());
        pager.setExistsPrePage(pageInfo.isHasPreviousPage());
        pager.setExistsNextPage(pageInfo.isHasNextPage());

        page.setPager(pager);
        page.setData(pageInfo.getList());

        return page;
    }

    @Override
    public String updateBlogInfo(BlogDTO blogDTO) {

        if(blogDTO.getBlogId() != null && !"".equals(blogDTO.getBlogId())){
            blogDTO.setBlogIds(blogDTO.getBlogId().split(","));
        }

        blogMapper.updateBlogInfo(blogDTO);

        return "success";
    }
}
