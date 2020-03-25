package com.gmd.mapper;

import com.gmd.pojo.Singer;

import java.util.List;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer singerId);

    int insert(Singer record);

    Singer selectByPrimaryKey(Integer singerId);

    List<Singer> selectAll();

    int updateByPrimaryKey(Singer record);

    Singer selectByName(String singerName);

    List<Singer> findSingerByname(String uname);
}