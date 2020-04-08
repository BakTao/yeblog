package com.tao.yeblog.dao;

import com.tao.yeblog.model.dto.AdminUserDTO;
import com.tao.yeblog.model.qo.AdminUserQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员登录Mapper
 */
@Mapper
public interface AdminUserMapper {

    /**
     * 获得用户信息
     * @param adminUserQO
     * @return
     */
    AdminUserDTO getAdminUserInfo(AdminUserQO adminUserQO);

    /**
     * 更新用户信息
     * @param adminUserDTO
     */
    void updateAdminUserInfo(AdminUserDTO adminUserDTO);
}
