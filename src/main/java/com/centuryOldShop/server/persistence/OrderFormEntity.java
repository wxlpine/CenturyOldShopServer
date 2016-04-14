package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderFormEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderFormEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 0698fce8-4586-41a2-840e-dadcff225b06
 */
public class OrderFormEntity implements Serializable {
    /**
     * @pdOid a7deefd7-bb5a-41f2-aeb6-aa6ecc6affd2
     */
    private long orderFormId;
    /**
     * @pdOid ae7e2115-8c8e-4e76-827c-477cb4e4a437
     */
    private Date orderedTime;
    /**
     * @pdOid f190ac20-6c30-44c1-9fc2-7b9f915b5f88
     */
    private Date payedTime;
    /**
     * @pdOid 0786f681-5319-4344-8398-86ad0e1e30cd
     */
    private Date sendTime;
    /**
     * @pdOid 0f0350f6-92dc-4fef-ad73-49b61ade7a56
     */
    private Date receiptedTime;
    /**
     * @pdOid 50300fe9-dc08-40c0-a6f0-ea193f05d97c
     */
    private String expressNumber;

    private List<OrderFormCommodityEntity> orderFormCommodity;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluationEntity> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userOrderForm mult=1..1 side=A
     */
    private AppUserEntity appUser;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopOrderForm mult=1..1 side=A
     */
    private ShopEntity shop;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=orderFormDiscountInfo mult=0..1 side=A
     */
    private DiscountInfoEntity discountInfo;
    /**
     * @pdRoleInfo migr=no name=OrderStatusType assc=orderFormOrderStatusType mult=1..1 side=A
     */
    private OrderStatusTypeEntity orderStatusType;
    /**
     * @pdRoleInfo migr=no name=DisputeStatusType assc=disputeStatusTypeOrderForm mult=1..1 side=A
     */
    private DisputeStatusTypeEntity disputeStatusType;

    //<editor-fold desc="constructor">
    public OrderFormEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public long getOrderFormId() {
        return orderFormId;
    }

    public OrderFormEntity setOrderFormId(long orderFormId) {
        this.orderFormId = orderFormId;
        return this;
    }

    public Date getOrderedTime() {
        return orderedTime;
    }

    public OrderFormEntity setOrderedTime(Date orderedTime) {
        this.orderedTime = orderedTime;
        return this;
    }

    public Date getPayedTime() {
        return payedTime;
    }

    public OrderFormEntity setPayedTime(Date payedTime) {
        this.payedTime = payedTime;
        return this;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public OrderFormEntity setSendTime(Date sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public Date getReceiptedTime() {
        return receiptedTime;
    }

    public OrderFormEntity setReceiptedTime(Date receiptedTime) {
        this.receiptedTime = receiptedTime;
        return this;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public OrderFormEntity setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
        return this;
    }

    public List<OrderFormCommodityEntity> getOrderFormCommodity() {
        return orderFormCommodity;
    }

    public OrderFormEntity setOrderFormCommodity(List<OrderFormCommodityEntity> orderFormCommodity) {
        this.orderFormCommodity = orderFormCommodity;
        return this;
    }

    public List<UserEvaluationEntity> getUserEvaluation() {
        return userEvaluation;
    }

    public OrderFormEntity setUserEvaluation(List<UserEvaluationEntity> userEvaluation) {
        this.userEvaluation = userEvaluation;
        return this;
    }

    public AppUserEntity getAppUser() {
        return appUser;
    }

    public OrderFormEntity setAppUser(AppUserEntity appUser) {
        this.appUser = appUser;
        return this;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public OrderFormEntity setShop(ShopEntity shop) {
        this.shop = shop;
        return this;
    }

    public DiscountInfoEntity getDiscountInfo() {
        return discountInfo;
    }

    public OrderFormEntity setDiscountInfo(DiscountInfoEntity discountInfo) {
        this.discountInfo = discountInfo;
        return this;
    }

    public OrderStatusTypeEntity getOrderStatusType() {
        return orderStatusType;
    }

    public OrderFormEntity setOrderStatusType(OrderStatusTypeEntity orderStatusType) {
        this.orderStatusType = orderStatusType;
        return this;
    }

    public DisputeStatusTypeEntity getDisputeStatusType() {
        return disputeStatusType;
    }

    public OrderFormEntity setDisputeStatusType(DisputeStatusTypeEntity disputeStatusType) {
        this.disputeStatusType = disputeStatusType;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderFormEntity orderForm = (OrderFormEntity) o;

        return orderFormId == orderForm.orderFormId;

    }

    @Override
    public int hashCode() {
        return (int) (orderFormId ^ (orderFormId >>> 32));
    }

    @Override
    public String toString() {
        return "OrderFormEntity{" +
                "orderFormId=" + orderFormId +
                ", orderedTime=" + orderedTime +
                ", payedTime=" + payedTime +
                ", sendTime=" + sendTime +
                ", receiptedTime=" + receiptedTime +
                ", expressNumber='" + expressNumber + '\'' +
                ", orderFormCommodity=" + orderFormCommodity +
                ", appUser=" + appUser +
                ", shop=" + shop +
                ", discountInfo=" + discountInfo +
                ", orderStatusType=" + orderStatusType +
                ", disputeStatusType=" + disputeStatusType +
                '}';
    }

    //</editor-fold>
}