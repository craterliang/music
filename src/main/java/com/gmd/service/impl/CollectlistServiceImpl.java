package com.gmd.service.impl;

import com.gmd.mapper.SongCollectlistMapper;
import com.gmd.pojo.SongCollectlist;
import com.gmd.service.CollectlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectlistService")
public class CollectlistServiceImpl implements CollectlistService {
    @Autowired
    private SongCollectlistMapper songCollectlistMapper;


    @Override
    public int insert(SongCollectlist record) {
        return songCollectlistMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer playlist_id, Integer song_id) {
        return songCollectlistMapper.deleteByPrimaryKey(playlist_id,song_id);
    }

    @Override
    public int deleteByPlayList(Integer playlist_id) {
        return songCollectlistMapper.deleteByPlayList(playlist_id);
    }

    @Override
    public List<SongCollectlist> selectLrcByColumns(Integer playlist_id) {
        return songCollectlistMapper.selectLrcByColumns(playlist_id);
    }

    @Override
    public List<SongCollectlist> selectAll() {
        return songCollectlistMapper.selectAll();
    }
}
