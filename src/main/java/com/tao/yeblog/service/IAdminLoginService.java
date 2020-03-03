package com.tao.yeblog.service;

import com.tao.yeblog.model.dto.AdminUserDTO;

public interface IAdminLoginService {

    /**
     * 获得用户信息
     * @param adminUserDTO
     * @return
     */
    AdminUserDTO getAdminUserInfo(AdminUserDTO adminUserDTO);
}
