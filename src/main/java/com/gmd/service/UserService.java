package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.User;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User login(User user);

    User selectByName(String name);

    PageInfo<User> findUserByname(String uname,Integer pageNumber);

    User selectByNameEmail(User user);

    int updateUserById(User user);
}
