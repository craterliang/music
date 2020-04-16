package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.SongCollect;

import java.util.List;

public interface CollectService {
    int deleteByPrimaryKey(Integer playlistId);

    int insert(SongCollect record);

    SongCollect selectByPrimaryKey(Integer playlistId);

    List<SongCollect> selectAll();

    int updateByPrimaryKey(SongCollect record);

    PageInfo<SongCollect> selectSongCollect(SongCollect record,Integer pagenumber);
}
