package com.tao.yeblog.model.qo;

import com.tao.yeblog.common.BasePage;
import lombok.Data;

/**
 * 专栏信息QO
 */
@Data
public class ColumnQO extends BasePage {

    private String name;    //名字

    private String columnId; //专栏Id

}
