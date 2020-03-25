package com.gmd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmd.mapper.SongReviewsMapper;
import com.gmd.pojo.SongReviews;
import com.gmd.pojo.SongReviewsVO;
import com.gmd.pojo.SongVO;
import com.gmd.service.ReviewsService;
import com.gmd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("reviewsService")
public class ReviewsServiceImpl implements ReviewsService {
    @Autowired
    private SongReviewsMapper songReviewsMapper;
    @Override
    public int deleteByPrimaryKey(Integer reviewsId) {
        return songReviewsMapper.deleteByPrimaryKey(reviewsId);
    }

    @Override
    public int insert(SongReviews record) {
        return songReviewsMapper.insert(record);
    }

    @Override
    public SongReviews selectByPrimaryKey(Integer reviewsId) {
        return songReviewsMapper.selectByPrimaryKey(reviewsId);
    }

    @Override
    public List<SongReviews> selectAll() {
        return songReviewsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SongReviews record) {
        return songReviewsMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SongReviewsVO> selectReviewsByColumns(SongReviewsVO songReviewsVO,Integer pageNumber) {
        if(songReviewsVO.getSongName()==null || songReviewsVO.getSongName()==""){
            songReviewsVO.setSongName("%%");
        }else{
            songReviewsVO.setSongName("%"+songReviewsVO.getSongName()+"%");
        }
        if(songReviewsVO.getUserName()==null || songReviewsVO.getUserName()==""){
            songReviewsVO.setUserName("%%");
        }else{
            songReviewsVO.setUserName("%"+songReviewsVO.getUserName()+"%");
        }
        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<SongReviewsVO> list = this.songReviewsMapper.selectReviewsByColumns(songReviewsVO);
        return new PageInfo<>(list);
    }
}
