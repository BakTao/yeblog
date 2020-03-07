package com.tao.yeblog.service.impl;

import com.tao.yeblog.dao.AdminLoginMapper;
import com.tao.yeblog.model.dto.AdminUserDTO;
import com.tao.yeblog.service.IAdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginService implements IAdminLoginService {

    @Autowired
    private AdminLoginMapper adminLoginMapper;

    @Override
    public AdminUserDTO getAdminUserInfo(AdminUserDTO adminUserDTO) {

        return adminLoginMapper.getAdminUserInfo(adminUserDTO);
    }

    @Override
    public void updateAdminUserInfo(AdminUserDTO adminUserDTO) {
        adminLoginMapper.updateAdminUserInfo(adminUserDTO);
    }
}
