package com.gmd.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer userSex;

    private String userEmail;

    private String userImage;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String userRdate;

    private Integer userRole;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String userBirthday;

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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserRdate() {
        return userRdate;
    }

    public void setUserRdate(String userRdate) {
        this.userRdate = userRdate;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex=" + userSex +
                ", userEmail='" + userEmail + '\'' +
                ", userImage='" + userImage + '\'' +
                ", userRdate='" + userRdate + '\'' +
                ", userRole=" + userRole +
                ", userBirthday='" + userBirthday + '\'' +
                '}';
    }


}