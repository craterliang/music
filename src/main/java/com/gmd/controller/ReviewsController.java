package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.Singer;
import com.gmd.pojo.SongReviews;
import com.gmd.pojo.SongReviewsVO;
import com.gmd.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("songReviews")
public class ReviewsController {
    @Autowired
    private ReviewsService reviewsService;

    @RequestMapping("/insert")
    public Integer insert(SongReviews songReviews) {
        return this.reviewsService.insert(songReviews);
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer reviewsId) {
        return this.reviewsService.deleteByPrimaryKey(reviewsId);
    }

    @RequestMapping("/updateReview")
    public Integer updateReview(SongReviews songReviews) {

        return this.reviewsService.updateByPrimaryKey(songReviews);
    }

    @RequestMapping("/selectById")
    public SongReviews selectById(Integer Id) {

        return reviewsService.selectByPrimaryKey(Id);
    }

    @RequestMapping("/findSongReviewsColumn")
    public PageInfo<SongReviewsVO> findSongReviewsColumn(SongReviewsVO songReviews , Integer pageNumber) {
        return this.reviewsService.selectReviewsByColumns(songReviews, pageNumber);
    }

}
