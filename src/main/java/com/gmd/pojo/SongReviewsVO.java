package com.gmd.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class SongReviewsVO {
    private Integer reviewsId;

    private Integer songId;

    private String songName;

    private Integer userId;

    private String userName;

    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getStatus() {
        return reviewsStatus;
    }

    public void setStatus(Integer reviewsStatus) {
        this.reviewsStatus = reviewsStatus;
    }

    @Override
    public String toString() {
        return "SongReviewsVO{" +
                "reviewsId=" + reviewsId +
                ", songId=" + songId +
                ", songName='" + songName + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", reviewsStatus=" + reviewsStatus +
                '}';
    }
}
