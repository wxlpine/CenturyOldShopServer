package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  CommodityEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 471ca747-75ab-4384-994e-a56f8972497f
 */
public class CommodityEntity implements Serializable {
    /**
     * @pdOid dc077716-c898-47eb-a3a4-6ea5ecec5394
     */
    private long commodityId;
    /**
     * @pdOid 685ee61f-f151-4986-bd09-e6e444dd8d81
     */
    private String commodityName;
    /**
     * @pdOid 413d3cc9-8b92-4891-840a-30550c1923b2
     */
    private String smallPhotoUrl;
    /**
     * @pdOid a9d71cd8-f9b8-4bd8-b2ea-6efc47f57f7e
     */
    private String shortDescription;
    /**
     * @pdOid 99650fb8-0949-4984-8647-0edf3c3920da
     */
    private double price;
    /**
     * @pdOid 8229e151-c0ac-4a90-b304-fa11251503ed
     */
    private int salesVolume;
    /**
     * @pdOid 7144f598-1b74-4372-a019-499cb4c22494
     */
    private boolean exemptionFromPostage;
    /**
     * @pdOid c4e05792-4494-455a-bbe6-88bb5ac817e7
     */
    private Date addedTime;
    /**
     * @pdOid 4c2e9fd7-ff03-4079-b1c8-e4af7beedc69
     */
    private String phoneTopBigPhotoUrl;
    /**
     * @pdOid 122170ce-eaa9-4a11-9e4d-2823e1a969ae
     */
    private boolean offShelf;
    /**
     * @pdOid 81e00445-b4d1-46ad-b96f-19e0c6fe853a
     */
    private int remainingQuantity;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=commodityDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfoEntity> discountInfo;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluationEntity> userEvaluation;
    private List<FavoriteEntity> favorite;
    private List<OrderFormCommodityEntity> orderFormCommodity;
    /**
     * @pdRoleInfo migr=no name=CommodityType assc=commodityCommodityType mult=1..1 side=A
     */
    private CommodityTypeEntity commodityType;
    private List<ShoppingCartEntity> shoppingCart;

    //<editor-fold desc="constructor">
    public CommodityEntity() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getCommodityId() {
        return commodityId;
    }

    public CommodityEntity setCommodityId(long commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public CommodityEntity setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public CommodityEntity setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public CommodityEntity setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public CommodityEntity setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public CommodityEntity setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
        return this;
    }

    public boolean isExemptionFromPostage() {
        return exemptionFromPostage;
    }

    public CommodityEntity setExemptionFromPostage(boolean exemptionFromPostage) {
        this.exemptionFromPostage = exemptionFromPostage;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public CommodityEntity setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public String getPhoneTopBigPhotoUrl() {
        return phoneTopBigPhotoUrl;
    }

    public CommodityEntity setPhoneTopBigPhotoUrl(String phoneTopBigPhotoUrl) {
        this.phoneTopBigPhotoUrl = phoneTopBigPhotoUrl;
        return this;
    }

    public boolean isOffShelf() {
        return offShelf;
    }

    public CommodityEntity setOffShelf(boolean offShelf) {
        this.offShelf = offShelf;
        return this;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public CommodityEntity setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
        return this;
    }

    public List<DiscountInfoEntity> getDiscountInfo() {
        return discountInfo;
    }

    public CommodityEntity setDiscountInfo(List<DiscountInfoEntity> discountInfo) {
        this.discountInfo = discountInfo;
        return this;
    }

    public List<UserEvaluationEntity> getUserEvaluation() {
        return userEvaluation;
    }

    public CommodityEntity setUserEvaluation(List<UserEvaluationEntity> userEvaluation) {
        this.userEvaluation = userEvaluation;
        return this;
    }

    public List<FavoriteEntity> getFavorite() {
        return favorite;
    }

    public CommodityEntity setFavorite(List<FavoriteEntity> favorite) {
        this.favorite = favorite;
        return this;
    }

    public List<OrderFormCommodityEntity> getOrderFormCommodity() {
        return orderFormCommodity;
    }

    public CommodityEntity setOrderFormCommodity(List<OrderFormCommodityEntity> orderFormCommodity) {
        this.orderFormCommodity = orderFormCommodity;
        return this;
    }

    public CommodityTypeEntity getCommodityType() {
        return commodityType;
    }

    public CommodityEntity setCommodityType(CommodityTypeEntity commodityType) {
        this.commodityType = commodityType;
        return this;
    }

    public List<ShoppingCartEntity> getShoppingCart() {
        return shoppingCart;
    }

    public CommodityEntity setShoppingCart(List<ShoppingCartEntity> shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommodityEntity commodity = (CommodityEntity) o;

        return commodityId == commodity.commodityId;

    }

    @Override
    public int hashCode() {
        return (int) (commodityId ^ (commodityId >>> 32));
    }

    @Override
    public String toString() {
        return "CommodityEntity{" +
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
                ", commodityType=" + commodityType +
                '}';
    }
    //</editor-fold>
}