package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DiscountInfoEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountInfoEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 26a388c6-ca24-4539-b787-6b2684dfe7b6
 */
public class DiscountInfoEntity implements Serializable {
    /**
     * @pdOid 9e8e6653-77bd-4295-b558-cb3b4882be34
     */
    private long discountInfoId;
    /**
     * @pdOid c3b4de36-0914-42f8-a17a-0145c696cffd
     */
    private String title;
    /**
     * @pdOid 8f63576f-cf66-4465-aa1f-afbd58b6d840
     */
    private Date discountStartTime;
    /**
     * null代表没有截止日期
     *
     * @pdOid ae063bdd-43da-4047-8e75-5771b1a69df6
     */
    private Date discountEndTime;
    /**
     * 价格减免开始金额
     *
     * @pdOid 4ccd9039-500b-423b-a894-e528efbfa63d
     */
    private double priceReduceMinPrice;
    /**
     * 减免额度
     *
     * @pdOid 5c993b05-6d26-4aef-8253-7667c922752f
     */
    private double priceReduceAmount;
    /**
     * 打折最低金额
     *
     * @pdOid 5a2c8e9c-56ae-45ac-ab6a-fce742eb2250
     */
    private double discountMinPrice;
    /**
     * 折扣值，比如9折之类的
     *
     * @pdOid 1769568a-b509-40ac-a145-70857941df9d
     */
    private double discountRatio;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderFormEntity> orderForm;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopDiscountInfo mult=1..1 side=A
     */
    private ShopEntity shop;
    /**
     * @pdRoleInfo migr=no name=DiscountType assc=discountInfoDiscountType mult=1..1 side=A
     */
    private DiscountTypeEntity discountType;
    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityDiscountInfo mult=0..1 side=A
     */
    private List<CommodityEntity> commodity;

    //<editor-fold desc="constructor">
    public DiscountInfoEntity() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">
    public long getDiscountInfoId() {
        return discountInfoId;
    }

    public DiscountInfoEntity setDiscountInfoId(long discountInfoId) {
        this.discountInfoId = discountInfoId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public DiscountInfoEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getDiscountStartTime() {
        return discountStartTime;
    }

    public DiscountInfoEntity setDiscountStartTime(Date discountStartTime) {
        this.discountStartTime = discountStartTime;
        return this;
    }

    public Date getDiscountEndTime() {
        return discountEndTime;
    }

    public DiscountInfoEntity setDiscountEndTime(Date discountEndTime) {
        this.discountEndTime = discountEndTime;
        return this;
    }

    public double getPriceReduceMinPrice() {
        return priceReduceMinPrice;
    }

    public DiscountInfoEntity setPriceReduceMinPrice(double priceReduceMinPrice) {
        this.priceReduceMinPrice = priceReduceMinPrice;
        return this;
    }

    public double getPriceReduceAmount() {
        return priceReduceAmount;
    }

    public DiscountInfoEntity setPriceReduceAmount(double priceReduceAmount) {
        this.priceReduceAmount = priceReduceAmount;
        return this;
    }

    public double getDiscountMinPrice() {
        return discountMinPrice;
    }

    public DiscountInfoEntity setDiscountMinPrice(double discountMinPrice) {
        this.discountMinPrice = discountMinPrice;
        return this;
    }

    public double getDiscountRatio() {
        return discountRatio;
    }

    public DiscountInfoEntity setDiscountRatio(double discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    public List<OrderFormEntity> getOrderForm() {
        return orderForm;
    }

    public DiscountInfoEntity setOrderForm(List<OrderFormEntity> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public DiscountInfoEntity setShop(ShopEntity shop) {
        this.shop = shop;
        return this;
    }

    public DiscountTypeEntity getDiscountType() {
        return discountType;
    }

    public DiscountInfoEntity setDiscountType(DiscountTypeEntity discountType) {
        this.discountType = discountType;
        return this;
    }

    public List<CommodityEntity> getCommodity() {
        return commodity;
    }

    public DiscountInfoEntity setCommodity(List<CommodityEntity> commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountInfoEntity that = (DiscountInfoEntity) o;

        return discountInfoId == that.discountInfoId;

    }

    @Override
    public int hashCode() {
        return (int) (discountInfoId ^ (discountInfoId >>> 32));
    }

    @Override
    public String toString() {
        return "DiscountInfoEntity{" +
                "discountInfoId=" + discountInfoId +
                ", title='" + title + '\'' +
                ", discountStartTime=" + discountStartTime +
                ", discountEndTime=" + discountEndTime +
                ", priceReduceMinPrice=" + priceReduceMinPrice +
                ", priceReduceAmount=" + priceReduceAmount +
                ", discountMinPrice=" + discountMinPrice +
                ", discountRatio=" + discountRatio +
                ", shop=" + shop +
                ", discountType=" + discountType +
                ", commodity=" + commodity +
                '}';
    }
    //</editor-fold>
}