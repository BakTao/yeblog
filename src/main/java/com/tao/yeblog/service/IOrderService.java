package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;

/**
 * 订单管理Service
 */
public interface IOrderService {

    /**
     * 获取用户信息
     * @param userQO
     * @return
     */
    IPage<UserDTO> pageUserInfo(UserQO userQO);
}
