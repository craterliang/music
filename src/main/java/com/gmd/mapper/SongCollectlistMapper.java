package com.gmd.mapper;

import com.gmd.pojo.SongCollectlist;
import java.util.List;

public interface SongCollectlistMapper {
    int insert(SongCollectlist record);

    int deleteByPrimaryKey(Integer playlist_id,Integer song_id);

    int deleteByPlayList(Integer playlist_id);

    List<SongCollectlist> selectLrcByColumns(Integer playlist_id);

    List<SongCollectlist> selectAll();
}