package com.gmd.controller;

import com.gmd.pojo.SongCollectlist;
import com.gmd.service.CollectlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("collectlistlist")
public class CollectlistController {
    @Autowired
    private CollectlistService collectlistlistService;

    @RequestMapping("/insert")
    public Integer insert(SongCollectlist collectlist) {
        return this.collectlistlistService.insert(collectlist);
    }

    @RequestMapping("/deleteByPrimaryKey")
    public Integer deleteByPrimaryKey(Integer playlist_id,Integer song_id ) {
        return this.collectlistlistService.deleteByPrimaryKey(playlist_id,song_id);
    }

    @RequestMapping("/deleteByPlayList")
    public Integer deleteByPlayList(Integer playlist_id) {
        return this.collectlistlistService.deleteByPlayList(playlist_id);
    }


    @RequestMapping("/selectAll")
    public List<SongCollectlist> selectAll() {
        return collectlistlistService.selectAll();
    }

    @RequestMapping("/selectLrcByColumns")
    public List<SongCollectlist> selectLrcByColumns(Integer playlist_id) {

        return this.collectlistlistService.selectLrcByColumns(playlist_id);
    }

}
