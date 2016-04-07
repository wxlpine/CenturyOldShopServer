package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  VideoIntroduction.java
 * Author:  cmicat
 * Purpose: Defines the Class VideoIntroduction
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid a802b270-652e-4a7e-b30b-af41441343d1
 */
public class VideoIntroduction implements Serializable {
    /**
     * @pdOid d17a2bc8-d181-49f8-a9ea-b3d5a428903e
     */
    private long videoIntroductionId;
    /**
     * @pdOid 14307a7b-543e-4a9e-b14f-0684d8b1a77c
     */
    private String videoUrl;
    /**
     * @pdOid cac9b799-6a37-4ab0-8bc2-561dd8651f74
     */
    private int duration;
    /**
     * @pdOid a78648b9-0428-4733-ae1b-2ce2301d3c8d
     */
    private String screenshotUrl;
    /**
     * @pdOid c3ee4aea-b59a-4770-8f2f-59b2888b1731
     */
    private int playedTimes;
    /**
     * @pdOid dcb578f7-ba44-433e-aa65-78e097637464
     */
    private double rate;
    /**
     * @pdOid 0c59870b-77b9-4ad9-a104-fb3ccae32936
     */
    private Date addedTime;

    /**
     * @pdRoleInfo migr=no name=RateKeyword assc=videoIntroductionKeyword coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<RateKeyword> rateKeywords;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopVideoIntroduction mult=1..1 side=A
     */
    private Shop shop;


    //<editor-fold desc="constructor">

    public VideoIntroduction() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getVideoIntroductionId() {
        return videoIntroductionId;
    }

    public VideoIntroduction setVideoIntroductionId(long videoIntroductionId) {
        this.videoIntroductionId = videoIntroductionId;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public VideoIntroduction setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public VideoIntroduction setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getScreenshotUrl() {
        return screenshotUrl;
    }

    public VideoIntroduction setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
        return this;
    }

    public int getPlayedTimes() {
        return playedTimes;
    }

    public VideoIntroduction setPlayedTimes(int playedTimes) {
        this.playedTimes = playedTimes;
        return this;
    }

    public double getRate() {
        return rate;
    }

    public VideoIntroduction setRate(double rate) {
        this.rate = rate;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public VideoIntroduction setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public List<RateKeyword> getRateKeywords() {
        return rateKeywords;
    }

    public VideoIntroduction setRateKeywords(List<RateKeyword> rateKeywords) {
        this.rateKeywords = rateKeywords;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public VideoIntroduction setShop(Shop shop) {
        this.shop = shop;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoIntroduction that = (VideoIntroduction) o;

        return videoIntroductionId == that.videoIntroductionId;

    }

    @Override
    public int hashCode() {
        return (int) (videoIntroductionId ^ (videoIntroductionId >>> 32));
    }

    @Override
    public String toString() {
        return "VideoIntroduction{" +
                "videoIntroductionId=" + videoIntroductionId +
                ", videoUrl='" + videoUrl + '\'' +
                ", duration=" + duration +
                ", screenshotUrl='" + screenshotUrl + '\'' +
                ", playedTimes=" + playedTimes +
                ", rate=" + rate +
                ", addedTime=" + addedTime +
                ", rateKeywords=" + rateKeywords +
                ", shop=" + shop +
                '}';
    }

    //</editor-fold>

}