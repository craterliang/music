package com.gmd.pojo;

public class SongVO {
    private Integer songId;

    private Integer singerId;

    private String singerName;

    private String songName;

    private String songStyle;

    private String songLangue;

    private String songPath;

    private String songTime;

    private String songAlbum;

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

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
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

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    @Override
    public String toString() {
        return "SongVO{" +
                "songId=" + songId +
                ", singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' +
                ", songStyle='" + songStyle + '\'' +
                ", songLangue='" + songLangue + '\'' +
                ", songPath='" + songPath + '\'' +
                ", songTime='" + songTime + '\'' +
                ", songAlbum='" + songAlbum + '\'' +
                '}';
    }
}
