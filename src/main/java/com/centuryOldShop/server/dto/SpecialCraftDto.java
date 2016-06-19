package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/24.
 */
public final class SpecialCraftDto implements Serializable {

    private long specialCraftId;
    private String title;
    private String smallPhotoUrl;
    private String introductionUrl;
    private java.util.Date addedTime;
    public String shortIntro;

    private long shopId;

    //<editor-fold name="accessor">

    public long getSpecialCraftId() {
        return specialCraftId;
    }

    public SpecialCraftDto setSpecialCraftId(long specialCraftId) {
        this.specialCraftId = specialCraftId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SpecialCraftDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public SpecialCraftDto setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getIntroductionUrl() {
        return introductionUrl;
    }

    public SpecialCraftDto setIntroductionUrl(String introductionUrl) {
        this.introductionUrl = introductionUrl;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public SpecialCraftDto setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public String getShortIntro() {
        return shortIntro;
    }

    public SpecialCraftDto setShortIntro(String shortIntro) {
        this.shortIntro = shortIntro;
        return this;
    }

    public long getShopId() {
        return shopId;
    }

    public SpecialCraftDto setShopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialCraftDto that = (SpecialCraftDto) o;
        return specialCraftId == that.specialCraftId &&
                shopId == that.shopId &&
                Objects.equals(title, that.title) &&
                Objects.equals(smallPhotoUrl, that.smallPhotoUrl) &&
                Objects.equals(introductionUrl, that.introductionUrl) &&
                Objects.equals(addedTime, that.addedTime) &&
                Objects.equals(shortIntro, that.shortIntro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialCraftId, title, smallPhotoUrl, introductionUrl, addedTime, shortIntro, shopId);
    }

    @Override
    public String toString() {
        return "SpecialCraftDto{" +
                "specialCraftId=" + specialCraftId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", introductionUrl='" + introductionUrl + '\'' +
                ", addedTime=" + addedTime +
                ", shortIntro='" + shortIntro + '\'' +
                ", shopId=" + shopId +
                '}';
    }

    //</editor-fold>

}
