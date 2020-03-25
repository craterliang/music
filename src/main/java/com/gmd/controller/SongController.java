package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Song;
import com.gmd.pojo.SongVO;
import com.gmd.pojo.User;
import com.gmd.service.SongService;
import com.gmd.util.DeleteFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("song")
public class SongController {
    
    @Autowired
    private SongService songService;

    @RequestMapping("insertSong")  
    public Integer insertSong(Song record) {
        int son = songService.insert(record);
        return son;
    }
    @RequestMapping("/deleteSongById")
    public Integer deleteSongById(Integer songId) {
        deleteImgFile(songId);
        return this.songService.deleteByPrimaryKey(songId);
    }
    @RequestMapping("/updateSong")
    public Integer updateSong(Song song) {
        return this.songService.updateByPrimaryKey(song);
    }
    @RequestMapping("/selectSongById")
    public Song selectSongById(Integer Id) {
        return this.songService.selectByPrimaryKey(Id);
    }
    @RequestMapping("/findSongColumn")
    public PageInfo<SongVO> findSongColumn(SongVO songVO, Integer pageNumber) {
        return this.songService.selectSongByColumns(songVO, pageNumber);
    }
    private void deleteImgFile(Integer id) {
        Song song = selectSongById(id);
        String file = "D:/Windows_library/musicLib/audio/" + song.getSongPath() + ".mp3";
        DeleteFileUtil.delete(file);
    }
}
