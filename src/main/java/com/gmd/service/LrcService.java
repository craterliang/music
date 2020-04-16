package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Lrc;
import java.util.List;

public interface LrcService {
    int deleteByPrimaryKey(Integer id);

    int insert(Lrc record);

    Lrc selectByPrimaryKey(Integer id);

    Lrc selectByName(String lrcName);

    List<Lrc> selectAll();

    PageInfo<Lrc> selectLrcByColumns(String lrc, Integer pageNumber);
}
