package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/19.
 */
public final class ShopStoryDto implements Serializable {

    private long storyId;
    private String storyName;
    private String storyContentUrl;
    private java.util.Date addedTime;
    private long shopId;
    private String storyTypeName;


    //<editor-fold name="accessor">

    public long getStoryId() {
        return storyId;
    }

    public ShopStoryDto setStoryId(long storyId) {
        this.storyId = storyId;
        return this;
    }

    public long getShopId() {
        return shopId;
    }

    public ShopStoryDto setShopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    public String getStoryName() {
        return storyName;
    }

    public ShopStoryDto setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }

    public String getStoryContentUrl() {
        return storyContentUrl;
    }

    public ShopStoryDto setStoryContentUrl(String storyContentUrl) {
        this.storyContentUrl = storyContentUrl;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public ShopStoryDto setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public String getStoryTypeName() {
        return storyTypeName;
    }

    public ShopStoryDto setStoryTypeName(String storyTypeName) {
        this.storyTypeName = storyTypeName;
        return this;
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopStoryDto that = (ShopStoryDto) o;
        return storyId == that.storyId &&
                shopId == that.shopId &&
                Objects.equals(storyName, that.storyName) &&
                Objects.equals(storyContentUrl, that.storyContentUrl) &&
                Objects.equals(addedTime, that.addedTime) &&
                Objects.equals(storyTypeName, that.storyTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyId, shopId, storyName, storyContentUrl, addedTime, storyTypeName);
    }

    @Override
    public String toString() {
        return "ShopStoryDto{" +
                "storyId=" + storyId +
                ", shopId=" + shopId +
                ", storyName='" + storyName + '\'' +
                ", storyContentUrl='" + storyContentUrl + '\'' +
                ", addedTime=" + addedTime +
                ", storyTypeName='" + storyTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}
