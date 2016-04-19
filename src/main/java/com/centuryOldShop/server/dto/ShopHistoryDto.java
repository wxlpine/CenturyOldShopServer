package com.centuryOldShop.server.dto;

import java.util.Date;

/**
 * Created by cmicat on 2016/4/19.
 */
public class ShopHistoryDto {

    private long shopHistoryId;
    private String title;
    private String smallPhotoUrl;
    private String shortDescription;
    private java.util.Date publishTime;
    private int visitCount;
    private String detailedIntroductionPageUrl;
    private long shopId;

    //<editor-fold desc="constructor">

    public ShopHistoryDto() {
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    public long getShopHistoryId() {
        return shopHistoryId;
    }

    public ShopHistoryDto setShopHistoryId(long shopHistoryId) {
        this.shopHistoryId = shopHistoryId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ShopHistoryDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public ShopHistoryDto setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ShopHistoryDto setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public ShopHistoryDto setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public ShopHistoryDto setVisitCount(int visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public String getDetailedIntroductionPageUrl() {
        return detailedIntroductionPageUrl;
    }

    public ShopHistoryDto setDetailedIntroductionPageUrl(String detailedIntroductionPageUrl) {
        this.detailedIntroductionPageUrl = detailedIntroductionPageUrl;
        return this;
    }

    public long getShopId() {
        return shopId;
    }

    public ShopHistoryDto setShopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopHistoryDto that = (ShopHistoryDto) o;

        if (shopHistoryId != that.shopHistoryId) return false;
        if (visitCount != that.visitCount) return false;
        if (shopId != that.shopId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (smallPhotoUrl != null ? !smallPhotoUrl.equals(that.smallPhotoUrl) : that.smallPhotoUrl != null)
            return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (publishTime != null ? !publishTime.equals(that.publishTime) : that.publishTime != null) return false;
        return detailedIntroductionPageUrl != null ? detailedIntroductionPageUrl.equals(that.detailedIntroductionPageUrl) : that.detailedIntroductionPageUrl == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (shopHistoryId ^ (shopHistoryId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (smallPhotoUrl != null ? smallPhotoUrl.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (publishTime != null ? publishTime.hashCode() : 0);
        result = 31 * result + visitCount;
        result = 31 * result + (detailedIntroductionPageUrl != null ? detailedIntroductionPageUrl.hashCode() : 0);
        result = 31 * result + (int) (shopId ^ (shopId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ShopHistoryDto{" +
                "shopHistoryId=" + shopHistoryId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", publishTime=" + publishTime +
                ", visitCount=" + visitCount +
                ", detailedIntroductionPageUrl='" + detailedIntroductionPageUrl + '\'' +
                ", shopId=" + shopId +
                '}';
    }

    //</editor-fold>
}
