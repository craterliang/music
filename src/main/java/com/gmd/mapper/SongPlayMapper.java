package com.gmd.mapper;

import com.gmd.pojo.SongPlay;
import java.util.List;

public interface SongPlayMapper {
    int insert(SongPlay record);

    List<SongPlay> selectAll();
}