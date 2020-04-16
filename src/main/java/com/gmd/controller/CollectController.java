package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.SongCollect;
import com.gmd.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("collect")
public class CollectController {
    
    @Autowired
    private CollectService collectService;

    @RequestMapping("/selectById")
    public SongCollect selectById(Integer Id) {

        return  collectService.selectByPrimaryKey(Id);
    }

    @RequestMapping("/findAllSongCollect")
    public List<SongCollect> findAllSongCollect() {
        return collectService.selectAll();
    }

    @RequestMapping("/findSongCollect")
    public PageInfo<SongCollect> findSongCollect(SongCollect collect, Integer pageNumber) {

        return this.collectService.selectSongCollect(collect, pageNumber);
    }

    @RequestMapping("/insert")
    public Integer insert(SongCollect collect) {
        return this.collectService.insert(collect);
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer collectId) {
        return this.collectService.deleteByPrimaryKey(collectId);
    }
    @RequestMapping("/updateSongCollect")
    public Integer updateSongCollect(SongCollect collect) {

        return this.collectService.updateByPrimaryKey(collect);
    }
}
