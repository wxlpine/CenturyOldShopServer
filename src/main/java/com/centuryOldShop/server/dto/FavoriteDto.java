package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/23.
 */
public final class FavoriteDto implements Serializable {

    private long userId;

    private List<Content> content;

    //<editor-fold name="accessor">

    public long getUserId() {
        return userId;
    }

    public FavoriteDto setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public List<Content> getContent() {
        return content;
    }

    public FavoriteDto setContent(List<Content> content) {
        this.content = content;
        return this;
    }
    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteDto that = (FavoriteDto) o;
        return userId == that.userId &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, content);
    }

    @Override
    public String toString() {
        return "FavoriteDto{" +
                "userId=" + userId +
                ", content=" + content +
                '}';
    }

    //</editor-fold>

    public static final class Content implements Serializable {
        private java.util.Date addTime;

        private CommodityDto commodity;

        //<editor-fold name="accessor">

        public Date getAddTime() {
            return addTime;
        }

        public Content setAddTime(Date addTime) {
            this.addTime = addTime;
            return this;
        }

        public CommodityDto getCommodity() {
            return commodity;
        }

        public Content setCommodity(CommodityDto commodity) {
            this.commodity = commodity;
            return this;
        }

        //</editor-fold>

        //<editor-fold name="common methods">

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Content content = (Content) o;
            return Objects.equals(addTime, content.addTime) &&
                    Objects.equals(commodity, content.commodity);
        }

        @Override
        public int hashCode() {
            return Objects.hash(addTime, commodity);
        }

        @Override
        public String toString() {
            return "Content{" +
                    "addTime=" + addTime +
                    ", commodity=" + commodity +
                    '}';
        }

        //</editor-fold>

    }

    public static final class CommodityDto implements Serializable {
        private long commodityId;

        private String commodityName;
        private String smallPhotoUrl;
        private String shortDescription;
        private double price;
        private int salesVolume;
        private boolean exemptionFromPostage;
        private java.util.Date addedTime;
        private String phoneTopBigPhotoUrl;
        private boolean offShelf;
        private int remainingQuantity;
        private String detailedIntroUrl;

        private long shopId;
        private String commodityType;

        //<editor-fold name="accessor">

        public long getCommodityId() {
            return commodityId;
        }

        public CommodityDto setCommodityId(long commodityId) {
            this.commodityId = commodityId;
            return this;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public CommodityDto setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }

        public String getSmallPhotoUrl() {
            return smallPhotoUrl;
        }

        public CommodityDto setSmallPhotoUrl(String smallPhotoUrl) {
            this.smallPhotoUrl = smallPhotoUrl;
            return this;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public CommodityDto setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public CommodityDto setPrice(double price) {
            this.price = price;
            return this;
        }

        public int getSalesVolume() {
            return salesVolume;
        }

        public CommodityDto setSalesVolume(int salesVolume) {
            this.salesVolume = salesVolume;
            return this;
        }

        public boolean isExemptionFromPostage() {
            return exemptionFromPostage;
        }

        public CommodityDto setExemptionFromPostage(boolean exemptionFromPostage) {
            this.exemptionFromPostage = exemptionFromPostage;
            return this;
        }

        public Date getAddedTime() {
            return addedTime;
        }

        public CommodityDto setAddedTime(Date addedTime) {
            this.addedTime = addedTime;
            return this;
        }

        public String getPhoneTopBigPhotoUrl() {
            return phoneTopBigPhotoUrl;
        }

        public CommodityDto setPhoneTopBigPhotoUrl(String phoneTopBigPhotoUrl) {
            this.phoneTopBigPhotoUrl = phoneTopBigPhotoUrl;
            return this;
        }

        public boolean isOffShelf() {
            return offShelf;
        }

        public CommodityDto setOffShelf(boolean offShelf) {
            this.offShelf = offShelf;
            return this;
        }

        public int getRemainingQuantity() {
            return remainingQuantity;
        }

        public CommodityDto setRemainingQuantity(int remainingQuantity) {
            this.remainingQuantity = remainingQuantity;
            return this;
        }

        public String getDetailedIntroUrl() {
            return detailedIntroUrl;
        }

        public CommodityDto setDetailedIntroUrl(String detailedIntroUrl) {
            this.detailedIntroUrl = detailedIntroUrl;
            return this;
        }

        public long getShopId() {
            return shopId;
        }

        public CommodityDto setShopId(long shopId) {
            this.shopId = shopId;
            return this;
        }

        public String getCommodityType() {
            return commodityType;
        }

        public CommodityDto setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }

        //</editor-fold>

        //<editor-fold name="common methods">

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CommodityDto that = (CommodityDto) o;
            return commodityId == that.commodityId &&
                    Double.compare(that.price, price) == 0 &&
                    salesVolume == that.salesVolume &&
                    exemptionFromPostage == that.exemptionFromPostage &&
                    offShelf == that.offShelf &&
                    remainingQuantity == that.remainingQuantity &&
                    shopId == that.shopId &&
                    Objects.equals(commodityName, that.commodityName) &&
                    Objects.equals(smallPhotoUrl, that.smallPhotoUrl) &&
                    Objects.equals(shortDescription, that.shortDescription) &&
                    Objects.equals(addedTime, that.addedTime) &&
                    Objects.equals(phoneTopBigPhotoUrl, that.phoneTopBigPhotoUrl) &&
                    Objects.equals(detailedIntroUrl, that.detailedIntroUrl) &&
                    Objects.equals(commodityType, that.commodityType);
        }

        @Override
        public int hashCode() {
            return Objects.hash(commodityId, commodityName, smallPhotoUrl, shortDescription, price, salesVolume,
                    exemptionFromPostage, addedTime, phoneTopBigPhotoUrl, offShelf, remainingQuantity, detailedIntroUrl,
                    shopId, commodityType);
        }

        @Override
        public String toString() {
            return "CommodityDto{" +
                    "commodityId=" + commodityId +
                    ", commodityName='" + commodityName + '\'' +
                    ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                    ", shortDescription='" + shortDescription + '\'' +
                    ", price=" + price +
                    ", salesVolume=" + salesVolume +
                    ", exemptionFromPostage=" + exemptionFromPostage +
                    ", addedTime=" + addedTime +
                    ", phoneTopBigPhotoUrl='" + phoneTopBigPhotoUrl + '\'' +
                    ", offShelf=" + offShelf +
                    ", remainingQuantity=" + remainingQuantity +
                    ", detailedIntroUrl='" + detailedIntroUrl + '\'' +
                    ", shopId=" + shopId +
                    ", commodityType='" + commodityType + '\'' +
                    '}';
        }

        //</editor-fold>

    }
}
