package com.tao.yeblog.rest;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.Response;
import com.tao.yeblog.model.dto.OrderDTO;
import com.tao.yeblog.model.qo.OrderQO;
import com.tao.yeblog.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单管理Controller
 */
@RestController
@RequestMapping("/back/orderServices")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 获取订单信息
     * @param orderQO
     * @return
     */
    @PostMapping("/pageOrderInfo")
    public Response<IPage<OrderDTO>> pageOrderInfo(OrderQO orderQO){
        return Response.successData(orderService.pageOrderInfo(orderQO));
    }
}
