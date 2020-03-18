package com.gmd.mapper;

import com.gmd.pojo.Song;
import com.gmd.pojo.SongVO;

import java.util.List;

public interface SongMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(Song record);

    Song selectByPrimaryKey(Integer songId);

    List<Song> selectAll();

    int updateByPrimaryKey(Song record);

    List<SongVO> selectSongByColumns(SongVO songVO);
}