package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.BlogDTO;
import com.tao.yeblog.model.qo.BlogQO;

/**
 * 博客管理Service
 */
public interface IBlogService {

    /**
     * 获取用户信息
     * @param blogQO
     * @return
     */
    IPage<BlogDTO> pageBlogInfo(BlogQO blogQO);

    /**
     * 更新用户信息
     * @param blogDTO
     */
    String updateBlogInfo(BlogDTO blogDTO);
}
