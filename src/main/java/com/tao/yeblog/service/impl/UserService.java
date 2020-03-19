package com.tao.yeblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tao.yeblog.common.IPage;
import com.tao.yeblog.common.PageDefaultImpl;
import com.tao.yeblog.common.Pager;
import com.tao.yeblog.dao.UserMapper;
import com.tao.yeblog.model.dto.UserDTO;
import com.tao.yeblog.model.qo.UserQO;
import com.tao.yeblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IPage<UserDTO> pageUserInfo(UserQO userQO) {
        PageDefaultImpl<UserDTO> page = new PageDefaultImpl<>();

        PageHelper.startPage(userQO.getPageIndex(),userQO.getPageSize());
        PageInfo<UserDTO> pageInfo = new PageInfo<>(userMapper.pageUserInfo(userQO));

        Pager pager = new Pager();
        pager.setPageIndex(pageInfo.getPageNum());
        pager.setPageSize(pageInfo.getPageSize());
        pager.setPageCount(pageInfo.getPages());
        pager.setRecordCount(pageInfo.getTotal());
        pager.setPrePageIndex(pageInfo.getPrePage());
        pager.setNextPageIndex(pageInfo.getNextPage());
        pager.setExistsPrePage(pageInfo.isHasPreviousPage());
        pager.setExistsNextPage(pageInfo.isHasNextPage());

        page.setPager(pager);
        page.setData(pageInfo.getList());

        return page;
    }
}
