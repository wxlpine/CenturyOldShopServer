/***********************************************************************
 * Module:  OrderForm.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid 27679646-5166-4d25-8128-7671458eef1c
 */
public class OrderForm implements java.io.Serializable {
    /**
     * @pdOid a2d57ee1-17f0-4bcb-9abc-bafe6623b523
     */
    private long orderFormId;
    /**
     * @pdOid 50d565be-49e2-478c-bb2d-8afd1e0baddb
     */
    private java.util.Date orderedTime;
    /**
     * @pdOid d71cfd7d-4e75-4bda-be85-1620b2f846ee
     */
    private java.util.Date payedTime;
    /**
     * @pdOid 75a25529-247f-4e46-b14f-7cb0dae92339
     */
    private java.util.Date sendTime;
    /**
     * @pdOid 057be4e7-7d40-4dca-89b0-4c5c45d0eaab
     */
    private java.util.Date receiptedTime;
    /**
     * @pdOid aa829361-b761-4122-b789-34a1bbf3a161
     */
    private String expressNumber;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=orderFormCommodity coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userOrderForm mult=1..1 side=A
     */
    private AppUser appUser;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopOrderForm mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=orderFormDiscountInfo mult=0..1 side=A
     */
    private DiscountInfo discountInfo;
    /**
     * @pdRoleInfo migr=no name=OrderStatusType assc=orderFormOrderStatusType mult=1..1 side=A
     */
    private OrderStatusType orderStatusType;
    /**
     * @pdRoleInfo migr=no name=DisputeStatusType assc=disputeStatusTypeOrderForm mult=1..1 side=A
     */
    private DisputeStatusType disputeStatusType;


    /**
     * Empty constructor which is required by Hibernate
     */
    public OrderForm() {
    }


    //<editor-fold name="accessor">

    /**
     * Get value of orderFormId
     *
     * @return orderFormId
     */
    public long getOrderFormId() {
        return orderFormId;
    }

    /**
     * Set value of orderFormId
     *
     * @param newOrderFormId
     */
    public void setOrderFormId(long newOrderFormId) {
        this.orderFormId = newOrderFormId;
    }

    /**
     * Get value of orderedTime
     *
     * @return orderedTime
     */
    public java.util.Date getOrderedTime() {
        return orderedTime;
    }

    /**
     * Set value of orderedTime
     *
     * @param newOrderedTime
     */
    public void setOrderedTime(java.util.Date newOrderedTime) {
        this.orderedTime = newOrderedTime;
    }

    /**
     * Get value of payedTime
     *
     * @return payedTime
     */
    public java.util.Date getPayedTime() {
        return payedTime;
    }

    /**
     * Set value of payedTime
     *
     * @param newPayedTime
     */
    public void setPayedTime(java.util.Date newPayedTime) {
        this.payedTime = newPayedTime;
    }

    /**
     * Get value of sendTime
     *
     * @return sendTime
     */
    public java.util.Date getSendTime() {
        return sendTime;
    }

    /**
     * Set value of sendTime
     *
     * @param newSendTime
     */
    public void setSendTime(java.util.Date newSendTime) {
        this.sendTime = newSendTime;
    }

    /**
     * Get value of receiptedTime
     *
     * @return receiptedTime
     */
    public java.util.Date getReceiptedTime() {
        return receiptedTime;
    }

    /**
     * Set value of receiptedTime
     *
     * @param newReceiptedTime
     */
    public void setReceiptedTime(java.util.Date newReceiptedTime) {
        this.receiptedTime = newReceiptedTime;
    }

    /**
     * Get value of expressNumber
     *
     * @return expressNumber
     */
    public String getExpressNumber() {
        return expressNumber;
    }

    /**
     * Set value of expressNumber
     *
     * @param newExpressNumber
     */
    public void setExpressNumber(String newExpressNumber) {
        this.expressNumber = newExpressNumber;
    }

    /**
     * Get value of orderFormPK.
     *
     * @return orderFormPK object
     */
    public OrderFormPK getOrderFormPK() {
        return new OrderFormPK(orderFormId);
    }

    /**
     * Set value of orderFormPK.
     *
     * @param pk
     */
    public void setOrderFormPK(OrderFormPK pk) {
        if (pk != null) {
            this.orderFormId = pk.getOrderFormId();
        }
    }


    /**
     * @pdGenerated default getter
     */
    public List<Commodity> getCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity.iterator();
    }

    /**
     * @param newCommodity
     * @pdGenerated default setter
     */
    public void setCommodity(List<Commodity> newCommodity) {
        //removeAllCommodity();
        this.commodity = newCommodity;
    }

    /**
     * @param newCommodity
     * @pdGenerated default add
     */
    public void addCommodity(Commodity newCommodity) {
        if (newCommodity == null)
            return;
        if (this.commodity == null)
            this.commodity = new java.util.ArrayList<Commodity>();
        if (!this.commodity.contains(newCommodity)) {
            this.commodity.add(newCommodity);
            newCommodity.addOrderForm(this);
        }
    }

    /**
     * @param oldCommodity
     * @pdGenerated default remove
     */
    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.commodity != null)
            if (this.commodity.contains(oldCommodity)) {
                this.commodity.remove(oldCommodity);
                oldCommodity.removeOrderForm(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllCommodity() {
        if (commodity != null) {
            Commodity oldCommodity;
            for (java.util.Iterator iter = getIteratorCommodity(); iter.hasNext(); ) {
                oldCommodity = (Commodity) iter.next();
                iter.remove();
                oldCommodity.removeOrderForm(this);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<UserEvaluation> getUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation.iterator();
    }

    /**
     * @param newUserEvaluation
     * @pdGenerated default setter
     */
    public void setUserEvaluation(List<UserEvaluation> newUserEvaluation) {
        //removeAllUserEvaluation();
        this.userEvaluation = newUserEvaluation;
    }

    /**
     * @param newUserEvaluation
     * @pdGenerated default add
     */
    public void addUserEvaluation(UserEvaluation newUserEvaluation) {
        if (newUserEvaluation == null)
            return;
        if (this.userEvaluation == null)
            this.userEvaluation = new java.util.ArrayList<UserEvaluation>();
        if (!this.userEvaluation.contains(newUserEvaluation)) {
            this.userEvaluation.add(newUserEvaluation);
            newUserEvaluation.setOrderForm(this);
        }
    }

    /**
     * @param oldUserEvaluation
     * @pdGenerated default remove
     */
    public void removeUserEvaluation(UserEvaluation oldUserEvaluation) {
        if (oldUserEvaluation == null)
            return;
        if (this.userEvaluation != null)
            if (this.userEvaluation.contains(oldUserEvaluation)) {
                this.userEvaluation.remove(oldUserEvaluation);
                oldUserEvaluation.setOrderForm((OrderForm) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllUserEvaluation() {
        if (userEvaluation != null) {
            UserEvaluation oldUserEvaluation;
            for (java.util.Iterator iter = getIteratorUserEvaluation(); iter.hasNext(); ) {
                oldUserEvaluation = (UserEvaluation) iter.next();
                iter.remove();
                oldUserEvaluation.setOrderForm((OrderForm) null);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public AppUser getAppUser() {
        return appUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default parent setter
     */
    public void setAppUser(AppUser newAppUser) {
        if (this.appUser == null || !this.appUser.equals(newAppUser)) {
            if (this.appUser != null) {
                AppUser oldAppUser = this.appUser;
                this.appUser = null;
                //oldAppUser.removeOrderForm(this);
            }
            if (newAppUser != null) {
                this.appUser = newAppUser;
                //this.appUser.addOrderForm(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param newShop
     * @pdGenerated default parent setter
     */
    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
                //oldShop.removeOrderForm(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addOrderForm(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public DiscountInfo getDiscountInfo() {
        return discountInfo;
    }

    /**
     * @param newDiscountInfo
     * @pdGenerated default parent setter
     */
    public void setDiscountInfo(DiscountInfo newDiscountInfo) {
        if (this.discountInfo == null || !this.discountInfo.equals(newDiscountInfo)) {
            if (this.discountInfo != null) {
                DiscountInfo oldDiscountInfo = this.discountInfo;
                this.discountInfo = null;
                //oldDiscountInfo.removeOrderForm(this);
            }
            if (newDiscountInfo != null) {
                this.discountInfo = newDiscountInfo;
                //this.discountInfo.addOrderForm(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public OrderStatusType getOrderStatusType() {
        return orderStatusType;
    }

    /**
     * @param newOrderStatusType
     * @pdGenerated default parent setter
     */
    public void setOrderStatusType(OrderStatusType newOrderStatusType) {
        if (this.orderStatusType == null || !this.orderStatusType.equals(newOrderStatusType)) {
            if (this.orderStatusType != null) {
                OrderStatusType oldOrderStatusType = this.orderStatusType;
                this.orderStatusType = null;
                //oldOrderStatusType.removeOrderForm(this);
            }
            if (newOrderStatusType != null) {
                this.orderStatusType = newOrderStatusType;
                //this.orderStatusType.addOrderForm(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public DisputeStatusType getDisputeStatusType() {
        return disputeStatusType;
    }

    /**
     * @param newDisputeStatusType
     * @pdGenerated default parent setter
     */
    public void setDisputeStatusType(DisputeStatusType newDisputeStatusType) {
        if (this.disputeStatusType == null || !this.disputeStatusType.equals(newDisputeStatusType)) {
            if (this.disputeStatusType != null) {
                DisputeStatusType oldDisputeStatusType = this.disputeStatusType;
                this.disputeStatusType = null;
                //oldDisputeStatusType.removeOrderForm(this);
            }
            if (newDisputeStatusType != null) {
                this.disputeStatusType = newDisputeStatusType;
                //this.disputeStatusType.addOrderForm(this);
            }
        }
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "OrderForm{" +
                "orderFormId=" + orderFormId +
                ", orderedTime=" + orderedTime +
                ", payedTime=" + payedTime +
                ", sendTime=" + sendTime +
                ", receiptedTime=" + receiptedTime +
                ", expressNumber='" + expressNumber + '\'' +
                ", appUser=" + appUser +
                ", shop=" + shop +
                ", discountInfo=" + discountInfo +
                ", orderStatusType=" + orderStatusType +
                ", disputeStatusType=" + disputeStatusType +
                '}';
    }

    //</editor-fold>


}