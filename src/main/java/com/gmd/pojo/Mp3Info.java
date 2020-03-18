package com.gmd.pojo;

import java.sql.Time;

public class Mp3Info {
    //音乐名
    private String songName;
    //歌手名
    private String singerName;
    //专辑名
    private String album;
    //时长
    private Time duration;
    //uuid
    private String uuid;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Mp3Info() {
    }

    public Mp3Info(String songName, String singerName, String album, Time duration) {
        this.songName = songName;
        this.singerName = singerName;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Mp3Info{" +
                "songName='" + songName + '\'' +
                ", singerName='" + singerName + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
