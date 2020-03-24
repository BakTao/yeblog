package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.BlogDTO;
import com.tao.yeblog.model.qo.BlogQO;
import com.tao.yeblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 博客管理Controller
 */
@RestController
@RequestMapping("/back/blogServices")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    /**
     * 获取博客信息
     * @param blogQO
     * @return
     */
    @PostMapping("/pageBlogInfo")
    public Response<IPage<BlogDTO>> pageBlogInfo(@RequestBody BlogQO blogQO){
        return Response.successData(blogService.pageBlogInfo(blogQO));
    }

    /**
     * 更新博客信息
     * @param blogDTO
     * @return
     */
    @PostMapping("/updateBlogInfo")
    public Response<String> updateBlogInfo(@RequestBody BlogDTO blogDTO){
        return Response.successData(blogService.updateBlogInfo(blogDTO));
    }
}
