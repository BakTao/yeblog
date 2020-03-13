package com.tao.yeblog.model.qo;

import com.tao.yeblog.common.BasePage;
import lombok.Data;

/**
 * 博客信息QO
 */
@Data
public class BlogQO extends BasePage {

    private String blogId;  //博客id

    private String userId; //用户Id

    private String columnId; //专栏id

    private String title;   //标题

    private String type;   //类型

    private String enable; //是否有效

}
