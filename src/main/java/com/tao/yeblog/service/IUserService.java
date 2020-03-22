package com.tao.yeblog.service;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;

/**
 * 用户管理Service
 */
public interface IUserService {

    /**
     * 获取用户信息
     * @param userQO
     * @return
     */
    IPage<UserDTO> pageUserInfo(UserQO userQO);

    /**
     * 更新用户信息
     * @param userDTO
     * @return
     */
    String updateUserInfo(UserDTO userDTO);
}
