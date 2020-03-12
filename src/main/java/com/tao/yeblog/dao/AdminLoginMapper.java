package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.AdminUserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员登录Mapper
 */
@Mapper
public interface AdminLoginMapper {

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
