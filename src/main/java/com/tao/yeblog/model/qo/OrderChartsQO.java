package com.tao.yeblog.model.qo;

import lombok.Data;

/**
 * 订单量统计QO
 */
@Data
public class OrderChartsQO {

    private String tjnys[]; //统计年月

    private String sjwd;    //时间维度,1-年,2-月,3-天
}
