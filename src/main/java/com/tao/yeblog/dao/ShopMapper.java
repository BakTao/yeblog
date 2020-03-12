package com.tao.yeblog.dao;

import com.tao.yeblog.common.IPage;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商城管理Mapper
 */
@Mapper
public interface ShopMapper {

    /**
     * 获取用户信息
     * @param userQO
     * @return
     */
    IPage<UserDTO> pageUserInfo(UserQO userQO);
}
