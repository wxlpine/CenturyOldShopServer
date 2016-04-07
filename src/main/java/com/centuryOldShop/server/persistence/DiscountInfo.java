package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DiscountInfo.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountInfo
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 26a388c6-ca24-4539-b787-6b2684dfe7b6
 */
public class DiscountInfo implements Serializable {
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
    private List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopDiscountInfo mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=DiscountType assc=discountInfoDiscountType mult=1..1 side=A
     */
    private DiscountType discountType;
    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityDiscountInfo mult=0..1 side=A
     */
    private List<Commodity> commodity;

    //<editor-fold desc="constructor">
    public DiscountInfo() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">
    public long getDiscountInfoId() {
        return discountInfoId;
    }

    public DiscountInfo setDiscountInfoId(long discountInfoId) {
        this.discountInfoId = discountInfoId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public DiscountInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getDiscountStartTime() {
        return discountStartTime;
    }

    public DiscountInfo setDiscountStartTime(Date discountStartTime) {
        this.discountStartTime = discountStartTime;
        return this;
    }

    public Date getDiscountEndTime() {
        return discountEndTime;
    }

    public DiscountInfo setDiscountEndTime(Date discountEndTime) {
        this.discountEndTime = discountEndTime;
        return this;
    }

    public double getPriceReduceMinPrice() {
        return priceReduceMinPrice;
    }

    public DiscountInfo setPriceReduceMinPrice(double priceReduceMinPrice) {
        this.priceReduceMinPrice = priceReduceMinPrice;
        return this;
    }

    public double getPriceReduceAmount() {
        return priceReduceAmount;
    }

    public DiscountInfo setPriceReduceAmount(double priceReduceAmount) {
        this.priceReduceAmount = priceReduceAmount;
        return this;
    }

    public double getDiscountMinPrice() {
        return discountMinPrice;
    }

    public DiscountInfo setDiscountMinPrice(double discountMinPrice) {
        this.discountMinPrice = discountMinPrice;
        return this;
    }

    public double getDiscountRatio() {
        return discountRatio;
    }

    public DiscountInfo setDiscountRatio(double discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    public List<OrderForm> getOrderForm() {
        return orderForm;
    }

    public DiscountInfo setOrderForm(List<OrderForm> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public DiscountInfo setShop(Shop shop) {
        this.shop = shop;
        return this;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public DiscountInfo setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
        return this;
    }

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public DiscountInfo setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountInfo that = (DiscountInfo) o;

        return discountInfoId == that.discountInfoId;

    }

    @Override
    public int hashCode() {
        return (int) (discountInfoId ^ (discountInfoId >>> 32));
    }

    @Override
    public String toString() {
        return "DiscountInfo{" +
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