package com.tao.yeblog.dao;

import com.github.pagehelper.Page;
import com.tao.yeblog.model.dto.BlogDTO;
import com.tao.yeblog.model.qo.BlogQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 博客管理Mapper
 */
@Mapper
public interface BlogMapper {

    /**
     * 获取博客信息
     * @param blogQO
     * @return
     */
    Page<BlogDTO> pageBlogInfo(BlogQO blogQO);

    /**
     * 更新博客信息
     * @param blogDTO
     * @return
     */
    void updateBlogInfo(BlogDTO blogDTO);
}
