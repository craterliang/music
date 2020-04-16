package com.gmd.pojo;

public class SongReviews {
    private Integer reviewsId;

    private Integer songId;

    private Integer userId;

    private String content;

    private String createTime;

    private Integer reviewsStatus;

    public Integer getReviewsId() {
        return reviewsId;
    }

    public void setReviewsId(Integer reviewsId) {
        this.reviewsId = reviewsId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getReviewsStatus() {
        return reviewsStatus;
    }

    public void setReviewsStatus(Integer reviewsStatus) {
        this.reviewsStatus = reviewsStatus;
    }
}