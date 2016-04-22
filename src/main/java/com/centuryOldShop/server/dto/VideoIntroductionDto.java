package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/21.
 */
public class VideoIntroductionDto implements Serializable {

    private long videoIntroductionId;
    private String videoUrl;
    private int duration;
    private String screenshotUrl;
    private int playedTimes;
    private double rate;
    private java.util.Date addedTime;

    private List<String> rateKeyword;

    private long shopId;

    //<editor-fold name="accessor">

    public long getVideoIntroductionId() {
        return videoIntroductionId;
    }

    public VideoIntroductionDto setVideoIntroductionId(long videoIntroductionId) {
        this.videoIntroductionId = videoIntroductionId;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public VideoIntroductionDto setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public VideoIntroductionDto setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getScreenshotUrl() {
        return screenshotUrl;
    }

    public VideoIntroductionDto setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
        return this;
    }

    public int getPlayedTimes() {
        return playedTimes;
    }

    public VideoIntroductionDto setPlayedTimes(int playedTimes) {
        this.playedTimes = playedTimes;
        return this;
    }

    public double getRate() {
        return rate;
    }

    public VideoIntroductionDto setRate(double rate) {
        this.rate = rate;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public VideoIntroductionDto setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public List<String> getRateKeyword() {
        return rateKeyword;
    }

    public VideoIntroductionDto setRateKeyword(List<String> rateKeyword) {
        this.rateKeyword = rateKeyword;
        return this;
    }

    public long getShopId() {
        return shopId;
    }

    public VideoIntroductionDto setShopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoIntroductionDto that = (VideoIntroductionDto) o;
        return videoIntroductionId == that.videoIntroductionId &&
                duration == that.duration &&
                playedTimes == that.playedTimes &&
                Double.compare(that.rate, rate) == 0 &&
                shopId == that.shopId &&
                Objects.equals(videoUrl, that.videoUrl) &&
                Objects.equals(screenshotUrl, that.screenshotUrl) &&
                Objects.equals(addedTime, that.addedTime) &&
                Objects.equals(rateKeyword, that.rateKeyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoIntroductionId, videoUrl, duration, screenshotUrl, playedTimes,
                rate, addedTime, rateKeyword, shopId);
    }

    @Override
    public String toString() {
        return "VideoIntroductionDto{" +
                "videoIntroductionId=" + videoIntroductionId +
                ", videoUrl='" + videoUrl + '\'' +
                ", duration=" + duration +
                ", screenshotUrl='" + screenshotUrl + '\'' +
                ", playedTimes=" + playedTimes +
                ", rate=" + rate +
                ", addedTime=" + addedTime +
                ", rateKeyword=" + rateKeyword +
                ", shopId=" + shopId +
                '}';
    }

    //</editor-fold>

}
