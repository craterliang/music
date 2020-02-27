package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.UserMapper;
import com.gmd.pojo.User;
import com.gmd.service.UserService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public PageInfo<User> findUserByname(String uname, Integer pageNumber) {
        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<User> list = this.userMapper.findUserByname(uname);
        return new PageInfo<>(list);
    }

    @Override
    public User selectByNameEmail(User user) {
        return userMapper.selectByNameEmail(user);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }
}
