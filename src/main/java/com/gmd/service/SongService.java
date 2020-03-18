package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Song;
import com.gmd.pojo.SongVO;

import java.util.List;

public interface SongService {
    int deleteByPrimaryKey(Integer songId);

    int insert(Song record);

    Song selectByPrimaryKey(Integer songId);

    List<Song> selectAll();

    int updateByPrimaryKey(Song record);

    PageInfo<SongVO> selectSongByColumns(SongVO songVO,Integer pageNumber);
}
