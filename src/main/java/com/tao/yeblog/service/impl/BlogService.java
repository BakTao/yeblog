package com.tao.yeblog.service.impl;

import com.tao.yeblog.common.IPage;
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
        return blogMapper.pageBlogInfo(blogQO);
    }

    @Override
    public void updateBlogInfo(BlogDTO blogDTO) {
        blogMapper.updateBlogInfo(blogDTO);
    }
}
