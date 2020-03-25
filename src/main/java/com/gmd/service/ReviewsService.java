package com.gmd.service;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.SongReviews;
import com.gmd.pojo.SongReviewsVO;

import java.util.List;

public interface ReviewsService {
    int deleteByPrimaryKey(Integer reviewsId);

    int insert(SongReviews record);

    SongReviews selectByPrimaryKey(Integer reviewsId);

    List<SongReviews> selectAll();

    int updateByPrimaryKey(SongReviews record);

    PageInfo<SongReviewsVO> selectReviewsByColumns(SongReviewsVO songReviewsVO, Integer pageNumber);
}
