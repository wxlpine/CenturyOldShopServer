package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/20.
 */
public class DiscountInfoDto implements Serializable {

    private long discountInfoId;

    private String title;
    private java.util.Date discountStartTime;
    /**
     * null代表没有截止日期
     */
    private java.util.Date discountEndTime;
    /**
     * 价格减免开始金额
     */
    private Double priceReduceMinPrice;
    /**
     * 减免额度
     */
    private Double priceReduceAmount;
    /**
     * 打折最低金额
     */
    private Double discountMinPrice;
    /**
     * 折扣值，比如9折之类的
     */
    private Double discountRatio;


    private String discountTypeName;

    private ShopDto shop;

    private List<CommodityDto> commodity;

    //<editor-fold name="constructor">

    public DiscountInfoDto() {
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    public long getDiscountInfoId() {
        return discountInfoId;
    }

    public DiscountInfoDto setDiscountInfoId(long discountInfoId) {
        this.discountInfoId = discountInfoId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public DiscountInfoDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getDiscountStartTime() {
        return discountStartTime;
    }

    public DiscountInfoDto setDiscountStartTime(Date discountStartTime) {
        this.discountStartTime = discountStartTime;
        return this;
    }

    public Date getDiscountEndTime() {
        return discountEndTime;
    }

    public DiscountInfoDto setDiscountEndTime(Date discountEndTime) {
        this.discountEndTime = discountEndTime;
        return this;
    }

    public Double getPriceReduceMinPrice() {
        return priceReduceMinPrice;
    }

    public DiscountInfoDto setPriceReduceMinPrice(Double priceReduceMinPrice) {
        this.priceReduceMinPrice = priceReduceMinPrice;
        return this;
    }

    public Double getPriceReduceAmount() {
        return priceReduceAmount;
    }

    public DiscountInfoDto setPriceReduceAmount(Double priceReduceAmount) {
        this.priceReduceAmount = priceReduceAmount;
        return this;
    }

    public Double getDiscountMinPrice() {
        return discountMinPrice;
    }

    public DiscountInfoDto setDiscountMinPrice(Double discountMinPrice) {
        this.discountMinPrice = discountMinPrice;
        return this;
    }

    public Double getDiscountRatio() {
        return discountRatio;
    }

    public DiscountInfoDto setDiscountRatio(Double discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    public String getDiscountTypeName() {
        return discountTypeName;
    }

    public DiscountInfoDto setDiscountTypeName(String discountTypeName) {
        this.discountTypeName = discountTypeName;
        return this;
    }

    public ShopDto getShop() {
        return shop;
    }

    public DiscountInfoDto setShop(ShopDto shop) {
        this.shop = shop;
        return this;
    }

    public List<CommodityDto> getCommodity() {
        return commodity;
    }

    public DiscountInfoDto setCommodity(List<CommodityDto> commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountInfoDto that = (DiscountInfoDto) o;
        return discountInfoId == that.discountInfoId &&
                Objects.equals(title, that.title) &&
                Objects.equals(discountStartTime, that.discountStartTime) &&
                Objects.equals(discountEndTime, that.discountEndTime) &&
                Objects.equals(priceReduceMinPrice, that.priceReduceMinPrice) &&
                Objects.equals(priceReduceAmount, that.priceReduceAmount) &&
                Objects.equals(discountMinPrice, that.discountMinPrice) &&
                Objects.equals(discountRatio, that.discountRatio) &&
                Objects.equals(discountTypeName, that.discountTypeName) &&
                Objects.equals(shop, that.shop) &&
                Objects.equals(commodity, that.commodity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountInfoId, title, discountStartTime, discountEndTime, priceReduceMinPrice,
                priceReduceAmount, discountMinPrice, discountRatio, discountTypeName, shop, commodity);
    }

    @Override
    public String toString() {
        return "DiscountInfoDto{" +
                "discountInfoId=" + discountInfoId +
                ", title='" + title + '\'' +
                ", discountStartTime=" + discountStartTime +
                ", discountEndTime=" + discountEndTime +
                ", priceReduceMinPrice=" + priceReduceMinPrice +
                ", priceReduceAmount=" + priceReduceAmount +
                ", discountMinPrice=" + discountMinPrice +
                ", discountRatio=" + discountRatio +
                ", discountTypeName='" + discountTypeName + '\'' +
                ", shop=" + shop +
                ", commodity=" + commodity +
                '}';
    }

    //</editor-fold>

    public static class CommodityDto implements Serializable {

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

        private String commodityType;

        //<editor-fold name="constructor">

        public CommodityDto() {
        }

        //</editor-fold>

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
            return Objects.hash(commodityId, commodityName, smallPhotoUrl, shortDescription, price,
                    salesVolume, exemptionFromPostage, addedTime, phoneTopBigPhotoUrl, offShelf,
                    remainingQuantity, detailedIntroUrl, commodityType);
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
                    ", commodityType='" + commodityType + '\'' +
                    '}';
        }

        //</editor-fold>
    }
}
