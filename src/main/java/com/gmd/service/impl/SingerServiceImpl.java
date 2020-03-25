package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.SingerMapper;
import com.gmd.pojo.Singer;
import com.gmd.service.SingerService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("SingerService")
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;


    public int deleteByPrimaryKey(Integer singerId) {
        return singerMapper.deleteByPrimaryKey(singerId);
    }

    @Override
    public int insert(Singer record) {
        return singerMapper.insert(record);
    }

    @Override
    public Singer selectByPrimaryKey(Integer singerId) {
        return singerMapper.selectByPrimaryKey(singerId);
    }

    @Override
    public List<Singer> selectAll() {
        return singerMapper.selectAll();
    }

    @Override
    public Singer selectByName(String singerName) {
        return this.singerMapper.selectByName(singerName);
    }

    @Override
    public int updateByPrimaryKey(Singer record) {
        return singerMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Singer> findSingerByname(String uname, Integer pageNumber) {
        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<Singer> list = this.singerMapper.findSingerByname(uname);
        return new PageInfo<>(list);
    }
}
