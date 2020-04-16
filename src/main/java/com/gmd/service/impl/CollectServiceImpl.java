package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.SongCollectMapper;
import com.gmd.pojo.SongCollect;
import com.gmd.service.CollectService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectService")
public class CollectServiceImpl implements CollectService {

    @Autowired
    private SongCollectMapper songCollectMapper;

    @Override
    public int deleteByPrimaryKey(Integer playlistId) {
        return songCollectMapper.deleteByPrimaryKey(playlistId);
    }

    @Override
    public int insert(SongCollect record) {
        return songCollectMapper.insert(record);
    }

    @Override
    public SongCollect selectByPrimaryKey(Integer playlistId) {
        return songCollectMapper.selectByPrimaryKey(playlistId);
    }

    @Override
    public List<SongCollect> selectAll() {
        return songCollectMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SongCollect record) {
        return songCollectMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SongCollect> selectSongCollect(SongCollect record, Integer pageNumber) {
        if(record.getPlaylistName()==null || record.getPlaylistName()==""){
            record.setPlaylistName("%%");
        }else{
            record.setPlaylistName("%"+record.getPlaylistName()+"%");
        }
        if(record.getUserName()==null || record.getUserName()==""){
            record.setUserName("%%");
        }else{
            record.setUserName("%"+record.getUserName()+"%");
        }

        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<SongCollect> list = this.songCollectMapper.selectSongCollect(record);
        return new PageInfo<>(list);
    }
}
