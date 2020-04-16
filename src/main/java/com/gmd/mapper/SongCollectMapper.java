package com.gmd.mapper;

import com.gmd.pojo.SongCollect;
import java.util.List;

public interface SongCollectMapper {
    int deleteByPrimaryKey(Integer playlistId);

    int insert(SongCollect record);

    SongCollect selectByPrimaryKey(Integer playlistId);

    List<SongCollect> selectAll();

    int updateByPrimaryKey(SongCollect record);

    List<SongCollect> selectSongCollect(SongCollect record);
}