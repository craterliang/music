package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Singer;

import java.util.List;

public interface SingerService {
    int deleteByPrimaryKey(Integer singerId);

    int insert(Singer record);

    Singer selectByPrimaryKey(Integer singerId);

    List<Singer> selectAll();

    int updateByPrimaryKey(Singer record);

    PageInfo<Singer> findSingerByname(String uname, Integer pageNumber);
}
