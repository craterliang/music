package com.gmd.pojo;

public class Song {
    private Integer songId;

    private Integer singerId;

    private String songDesc;

    private String songStyle;

    private String songLangue;

    private String songPath;

    private String songPicPath;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public String getSongDesc() {
        return songDesc;
    }

    public void setSongDesc(String songDesc) {
        this.songDesc = songDesc;
    }

    public String getSongStyle() {
        return songStyle;
    }

    public void setSongStyle(String songStyle) {
        this.songStyle = songStyle;
    }

    public String getSongLangue() {
        return songLangue;
    }

    public void setSongLangue(String songLangue) {
        this.songLangue = songLangue;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    public String getSongPicPath() {
        return songPicPath;
    }

    public void setSongPicPath(String songPicPath) {
        this.songPicPath = songPicPath;
    }
}