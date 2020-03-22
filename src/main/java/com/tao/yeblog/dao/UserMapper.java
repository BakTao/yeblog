package com.tao.yeblog.dao;

import com.github.pagehelper.Page;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户管理Mapper
 */
@Mapper
public interface UserMapper {

    /**
     * 获取用户信息
     * @param userQO
     * @return
     */
    Page<UserDTO> pageUserInfo(UserQO userQO);

    /**
     * 更新用户信息
     * @param userDTO
     * @return
     */
    void updateUserInfo(UserDTO userDTO);

}
