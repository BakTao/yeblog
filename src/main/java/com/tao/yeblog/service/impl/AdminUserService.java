package com.tao.yeblog.service.impl;

import com.tao.yeblog.dao.AdminUserMapper;
import com.tao.yeblog.model.dto.AdminUserDTO;
import com.tao.yeblog.model.qo.AdminUserQO;
import com.tao.yeblog.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService implements IAdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUserDTO getAdminUserInfo(AdminUserQO adminUserQO) {
        return adminUserMapper.getAdminUserInfo(adminUserQO);
    }

    @Override
    public String updateAdminUserInfo(AdminUserDTO adminUserDTO) {

        adminUserMapper.updateAdminUserInfo(adminUserDTO);
        return "success";
    }
}
