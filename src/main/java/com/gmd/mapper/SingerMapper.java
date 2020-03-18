package com.gmd.mapper;

import com.gmd.pojo.Singer;
import com.gmd.pojo.User;

import java.util.List;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer singerId);

    int insert(Singer record);

    Singer selectByPrimaryKey(Integer singerId);

    List<Singer> selectAll();

    int updateByPrimaryKey(Singer record);

    List<Singer> findSingerByname(String uname);
}