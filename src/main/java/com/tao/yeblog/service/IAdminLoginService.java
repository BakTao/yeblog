package com.tao.yeblog.service;

import com.tao.yeblog.model.dto.AdminUserDTO;

/**
 * 管理员登录Service
 */
public interface IAdminLoginService {

    /**
     * 获得用户信息
     * @param adminUserDTO
     * @return
     */
    AdminUserDTO getAdminUserInfo(AdminUserDTO adminUserDTO);

    /**
     * 更新用户信息
     * @param adminUserDTO
     */
    void updateAdminUserInfo(AdminUserDTO adminUserDTO);
}
