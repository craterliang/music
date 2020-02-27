package com.gmd.mapper;

import com.gmd.pojo.SongReviews;
import java.util.List;

public interface SongReviewsMapper {
    int deleteByPrimaryKey(Integer reviewsId);

    int insert(SongReviews record);

    SongReviews selectByPrimaryKey(Integer reviewsId);

    List<SongReviews> selectAll();

    int updateByPrimaryKey(SongReviews record);
}