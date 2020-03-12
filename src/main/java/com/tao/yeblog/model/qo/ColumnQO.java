package com.tao.yeblog.model.qo;

import com.tao.yeblog.common.BasePage;
import lombok.Data;

/**
 * 专栏信息QO
 */
@Data
public class ColumnQO extends BasePage {

    private String name;    //名字

    private String loginId; //登录Id

    private String sex;     //性别

    private String phone;   //手机号码

    private String email;   //邮箱
}
