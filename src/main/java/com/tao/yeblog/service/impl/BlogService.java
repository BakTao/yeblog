package com.tao.yeblog.service.impl;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.dao.UserMapper;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;
import com.tao.yeblog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IPage<UserDTO> pageUserInfo(UserQO userQO) {
        return userMapper.pageUserInfo(userQO);
    }
}
