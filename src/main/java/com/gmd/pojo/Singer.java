package com.gmd.pojo;

public class Singer {
    private Integer singerId;

    private String singerName;

    private String singerSex;

    private String singerDesc;

    private String singerType;

    private String singerImage;

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

    public String getSingerSex() {
        return singerSex;
    }

    public void setSingerSex(String singerSex) {
        this.singerSex = singerSex;
    }

    public String getSingerDesc() {
        return singerDesc;
    }

    public void setSingerDesc(String singerDesc) {
        this.singerDesc = singerDesc;
    }

    public String getSingerType() {
        return singerType;
    }

    public void setSingerType(String singerType) {
        this.singerType = singerType;
    }

    public String getSingerImage() {
        return singerImage;
    }

    public void setSingerImage(String singerImage) {
        this.singerImage = singerImage;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                ", singerSex='" + singerSex + '\'' +
                ", singerDesc='" + singerDesc + '\'' +
                ", singerType='" + singerType + '\'' +
                ", singerImage='" + singerImage + '\'' +
                '}';
    }
}