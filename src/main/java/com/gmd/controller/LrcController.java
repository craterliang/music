package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Lrc;
import com.gmd.service.LrcService;
import com.gmd.util.DeleteFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lrc")
public class LrcController {
    @Autowired
    private LrcService lrcService;
    
    @RequestMapping("insertLrc")
    public Integer insertLrc(Lrc record) {
        int son = lrcService.insert(record);
        return son;
    }
    @RequestMapping("/deleteLrcById")
    public Integer deleteLrcById(Integer Id) {
        deleteImgFile(Id);
        return this.lrcService.deleteByPrimaryKey(Id);
    }
    @RequestMapping("/selectLrcById")
    public Lrc selectLrcById(Integer Id) {

        return this.lrcService.selectByPrimaryKey(Id);
    }

    @RequestMapping("/selectLrcByName")
    public Lrc selectLrcByName(String lrcName) {

        return this.lrcService.selectByName(lrcName);
    }

    @RequestMapping("/findLrcColumn")
    public PageInfo<Lrc> findLrcColumn(String lrc, Integer pageNumber) {
        return this.lrcService.selectLrcByColumns(lrc, pageNumber);
    }
    private void deleteImgFile(Integer id) {
        Lrc song = selectLrcById(id);
        String file = "D:/Windows_library/musicLib/lrc/" + song.getLrcPath() + ".lrc";
        DeleteFileUtil.delete(file);
    }
}
