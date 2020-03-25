package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Singer;
import com.gmd.pojo.User;
import com.gmd.service.SingerService;
import com.gmd.util.DeleteFileUtil;
import net.sf.jsqlparser.statement.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("singer")
public class SIngerController {
    
    @Autowired
    private SingerService singerService;

    @RequestMapping("/selectById")
    public Singer selectById(Integer Id) {

        Singer singer = singerService.selectByPrimaryKey(Id);
        return singer;
    }

    @RequestMapping("/findAllSinger")
    public List<Singer> findAllSinger() {
        return singerService.selectAll();
    }

    @RequestMapping("/findAll")
    public PageInfo<Singer> findAll(String uname, Integer pageNumber) {
        if (uname != null && uname != "") {
            uname = "%" + uname + "%";
        } else {
            uname = "%%";
        }
        return this.singerService.findSingerByname(uname, pageNumber);
    }
    @RequestMapping("/selectByName")
    public Singer selectByName(String uname) {
        return this.singerService.selectByName(uname);
    }
    @RequestMapping("/insert")
    public Integer insert(Singer singer) {
        return this.singerService.insert(singer);
    }
    @RequestMapping("/updateSinger")
    public Integer updateSinger(Singer singer,Integer upBool) {
        if (upBool == 1) {
            deleteImgFile(singer.getSingerId());
        }
        return this.singerService.updateByPrimaryKey(singer);
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer singerId) {
        deleteImgFile(singerId);
        return this.singerService.deleteByPrimaryKey(singerId);
    }
    private void deleteImgFile(Integer id) {
        Singer singer = selectById(id);
        String file = "D:/Windows_library/musicLib/img/" + singer.getSingerImage() + ".jpg";
        DeleteFileUtil.delete(file);
    }
    
}
