package com.gmd.mapper;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Lrc;
import java.util.List;

public interface LrcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lrc record);

    Lrc selectByPrimaryKey(Integer id);

    Lrc selectByName(String lrcName);

    List<Lrc> selectAll();

    int updateByPrimaryKey(Lrc record);

    List<Lrc> selectLrcByColumns(String lrc);
}