package com.gmd.mapper;

import com.gmd.pojo.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User login(User user);

    User selectByName(String name);

    List<User> findUserByname(String uname);

    User selectByNameEmail(User user);
    //修改密码
    int updateUserById(User user);
}
