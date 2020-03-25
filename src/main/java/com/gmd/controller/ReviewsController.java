package com.gmd.controller;

import com.gmd.pojo.Singer;
import com.gmd.pojo.SongReviews;
import com.gmd.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("review")
public class ReviewsController {
    @Autowired
    private ReviewsService reviewsService;

    @RequestMapping("/insert")
    public Integer insert(SongReviews songReviews) {
        return this.reviewsService.insert(songReviews);
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer ) {
        return this.reviewsService.deleteByPrimaryKey(singerId);
    }
    @RequestMapping("/updateSinger")
    public Integer updateSinger(Singer singer,Integer upBool) {
        if (upBool == 1) {
            deleteImgFile(singer.getSingerId());
        }
        return this.singerService.updateByPrimaryKey(singer);
    }


}
