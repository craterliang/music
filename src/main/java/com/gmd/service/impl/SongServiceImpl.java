package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.SongMapper;
import com.gmd.pojo.Singer;
import com.gmd.pojo.Song;
import com.gmd.pojo.SongVO;
import com.gmd.service.SongService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SongService")
public class SongServiceImpl implements SongService {
    @Autowired
    private SongMapper songMapper;

    @Override
    public int deleteByPrimaryKey(Integer songId) {
        return songMapper.deleteByPrimaryKey(songId);
    }

    @Override
    public int insert(Song record) {
        return songMapper.insert(record);
    }

    @Override
    public Song selectByPrimaryKey(Integer songId) {
        return songMapper.selectByPrimaryKey(songId);
    }

    @Override
    public List<Song> selectAll() {
        return songMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Song record) {
        return songMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SongVO> selectSongByColumns(SongVO songVO, Integer pageNumber) {
        if(songVO.getSongName()==null || songVO.getSongName()==""){
            songVO.setSongName("%%");
        }else{
            songVO.setSongName("%"+songVO.getSongName()+"%");
        }
        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<SongVO> list = this.songMapper.selectSongByColumns(songVO);
        return new PageInfo<>(list);
    }
}
