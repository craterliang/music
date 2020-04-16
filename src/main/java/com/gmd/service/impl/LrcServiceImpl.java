package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.LrcMapper;
import com.gmd.pojo.Lrc;
import com.gmd.pojo.SongReviewsVO;
import com.gmd.service.LrcService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("lrcService")
public class LrcServiceImpl implements LrcService {

    @Autowired
    private LrcMapper lrcMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lrcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Lrc record) {
        return lrcMapper.insert(record);
    }

    @Override
    public Lrc selectByPrimaryKey(Integer id) {
        return lrcMapper.selectByPrimaryKey(id);
    }

    @Override
    public Lrc selectByName(String lrcName) {
        return lrcMapper.selectByName(lrcName);
    }

    @Override
    public List<Lrc> selectAll() {
        return lrcMapper.selectAll();
    }

    @Override
    public PageInfo<Lrc> selectLrcByColumns(String lrc, Integer pageNumber) {
        if(lrc==null || lrc==""){
            lrc="%%";
        }else{
            lrc="%"+lrc+"%";
        }
        PageHelper.startPage(pageNumber, 8);
        List<Lrc> list = this.lrcMapper.selectLrcByColumns(lrc);
        return new PageInfo<>(list);
    }
}
