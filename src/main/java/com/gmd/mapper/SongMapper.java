package com.gmd.mapper;

import com.gmd.pojo.Song;
import java.util.List;

public interface SongMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(Song record);

    Song selectByPrimaryKey(Integer songId);

    List<Song> selectAll();

    int updateByPrimaryKey(Song record);
}