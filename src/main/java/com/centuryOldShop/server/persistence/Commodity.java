package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  Commodity.java
 * Author:  cmicat
 * Purpose: Defines the Class Commodity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 471ca747-75ab-4384-994e-a56f8972497f
 */
public class Commodity implements Serializable {
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
    private List<DiscountInfo> discountInfo;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    private List<Favorite> favorite;
    private List<OrderFormCommodity> orderFormCommodity;
    /**
     * @pdRoleInfo migr=no name=CommodityType assc=commodityCommodityType mult=1..1 side=A
     */
    private CommodityType commodityType;
    private List<ShoppingCart> shoppingCart;

    //<editor-fold desc="constructor">
    public Commodity() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getCommodityId() {
        return commodityId;
    }

    public Commodity setCommodityId(long commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public Commodity setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public Commodity setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Commodity setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Commodity setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public Commodity setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
        return this;
    }

    public boolean isExemptionFromPostage() {
        return exemptionFromPostage;
    }

    public Commodity setExemptionFromPostage(boolean exemptionFromPostage) {
        this.exemptionFromPostage = exemptionFromPostage;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public Commodity setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public String getPhoneTopBigPhotoUrl() {
        return phoneTopBigPhotoUrl;
    }

    public Commodity setPhoneTopBigPhotoUrl(String phoneTopBigPhotoUrl) {
        this.phoneTopBigPhotoUrl = phoneTopBigPhotoUrl;
        return this;
    }

    public boolean isOffShelf() {
        return offShelf;
    }

    public Commodity setOffShelf(boolean offShelf) {
        this.offShelf = offShelf;
        return this;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public Commodity setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
        return this;
    }

    public List<DiscountInfo> getDiscountInfo() {
        return discountInfo;
    }

    public Commodity setDiscountInfo(List<DiscountInfo> discountInfo) {
        this.discountInfo = discountInfo;
        return this;
    }

    public List<UserEvaluation> getUserEvaluation() {
        return userEvaluation;
    }

    public Commodity setUserEvaluation(List<UserEvaluation> userEvaluation) {
        this.userEvaluation = userEvaluation;
        return this;
    }

    public List<Favorite> getFavorite() {
        return favorite;
    }

    public Commodity setFavorite(List<Favorite> favorite) {
        this.favorite = favorite;
        return this;
    }

    public List<OrderFormCommodity> getOrderFormCommodity() {
        return orderFormCommodity;
    }

    public Commodity setOrderFormCommodity(List<OrderFormCommodity> orderFormCommodity) {
        this.orderFormCommodity = orderFormCommodity;
        return this;
    }

    public CommodityType getCommodityType() {
        return commodityType;
    }

    public Commodity setCommodityType(CommodityType commodityType) {
        this.commodityType = commodityType;
        return this;
    }

    public List<ShoppingCart> getShoppingCart() {
        return shoppingCart;
    }

    public Commodity setShoppingCart(List<ShoppingCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commodity commodity = (Commodity) o;

        return commodityId == commodity.commodityId;

    }

    @Override
    public int hashCode() {
        return (int) (commodityId ^ (commodityId >>> 32));
    }

    @Override
    public String toString() {
        return "Commodity{" +
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