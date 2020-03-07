package com.tao.yeblog.model.qo;

import lombok.Data;

@Data
public class RegisterChartsQO {

    private String tjnys[]; //统计年月

    private String sjwd;    //时间维度,1-年,2-月,3-天
}
