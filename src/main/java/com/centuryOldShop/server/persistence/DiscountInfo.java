/***********************************************************************
 * Module:  DiscountInfo.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Iterator;
import java.util.List;

/**
 * @pdOid a85c5231-1f5c-43cd-8c62-325fdcd365b3
 */
public class DiscountInfo implements java.io.Serializable {

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

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;
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
     * Empty constructor which is required by Hibernate
     */
    public DiscountInfo() {
    }


    //<editor-fold name="accessor">

    public long getDiscountInfoId() {
        return discountInfoId;
    }

    public void setDiscountInfoId(long newDiscountInfoId) {
        this.discountInfoId = newDiscountInfoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public java.util.Date getDiscountStartTime() {
        return discountStartTime;
    }

    public void setDiscountStartTime(java.util.Date newDiscountStartTime) {
        this.discountStartTime = newDiscountStartTime;
    }

    public java.util.Date getDiscountEndTime() {
        return discountEndTime;
    }

    public void setDiscountEndTime(java.util.Date newDiscountEndTime) {
        this.discountEndTime = newDiscountEndTime;
    }

    public Double getPriceReduceMinPrice() {
        return priceReduceMinPrice;
    }

    public DiscountInfo setPriceReduceMinPrice(Double priceReduceMinPrice) {
        this.priceReduceMinPrice = priceReduceMinPrice;
        return this;
    }

    public Double getPriceReduceAmount() {
        return priceReduceAmount;
    }

    public DiscountInfo setPriceReduceAmount(Double priceReduceAmount) {
        this.priceReduceAmount = priceReduceAmount;
        return this;
    }

    public Double getDiscountMinPrice() {
        return discountMinPrice;
    }

    public DiscountInfo setDiscountMinPrice(Double discountMinPrice) {
        this.discountMinPrice = discountMinPrice;
        return this;
    }

    public Double getDiscountRatio() {
        return discountRatio;
    }

    public DiscountInfo setDiscountRatio(Double discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    public DiscountInfoPK getDiscountInfoPK() {
        return new DiscountInfoPK(discountInfoId);
    }

    public void setDiscountInfoPK(DiscountInfoPK pk) {
        if (pk != null) {
            this.discountInfoId = pk.getDiscountInfoId();
        }
    }

    public List<Commodity> getCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity;
    }

    public Iterator getIteratorCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity.iterator();
    }

    public void setCommodity(List<Commodity> newCommodity) {
        //removeAllCommodity();
        this.commodity = newCommodity;
    }

    public void addCommodity(Commodity newCommodity) {
        if (newCommodity == null)
            return;
        if (this.commodity == null)
            this.commodity = new java.util.ArrayList<Commodity>();
        if (!this.commodity.contains(newCommodity))
            this.commodity.add(newCommodity);
    }

    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.commodity != null)
            if (this.commodity.contains(oldCommodity))
                this.commodity.remove(oldCommodity);
    }

    public void removeAllCommodity() {
        if (commodity != null)
            commodity.clear();
    }

    public List<OrderForm> getOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm;
    }

    public Iterator getIteratorOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm.iterator();
    }

    public void setOrderForm(List<OrderForm> newOrderForm) {
        //removeAllOrderForm();
        this.orderForm = newOrderForm;
    }

    public void addOrderForm(OrderForm newOrderForm) {
        if (newOrderForm == null)
            return;
        if (this.orderForm == null)
            this.orderForm = new java.util.ArrayList<OrderForm>();
        if (!this.orderForm.contains(newOrderForm)) {
            this.orderForm.add(newOrderForm);
            newOrderForm.setDiscountInfo(this);
        }
    }

    public void removeOrderForm(OrderForm oldOrderForm) {
        if (oldOrderForm == null)
            return;
        if (this.orderForm != null)
            if (this.orderForm.contains(oldOrderForm)) {
                this.orderForm.remove(oldOrderForm);
                oldOrderForm.setDiscountInfo((DiscountInfo) null);
            }
    }

    public void removeAllOrderForm() {
        if (orderForm != null) {
            OrderForm oldOrderForm;
            for (Iterator iter = getIteratorOrderForm(); iter.hasNext(); ) {
                oldOrderForm = (OrderForm) iter.next();
                iter.remove();
                oldOrderForm.setDiscountInfo((DiscountInfo) null);
            }
        }
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
                //oldShop.removeDiscountInfo(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addDiscountInfo(this);
            }
        }
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType newDiscountType) {
        if (this.discountType == null || !this.discountType.equals(newDiscountType)) {
            if (this.discountType != null) {
                DiscountType oldDiscountType = this.discountType;
                this.discountType = null;
                //oldDiscountType.removeDiscountInfo(this);
            }
            if (newDiscountType != null) {
                this.discountType = newDiscountType;
                //this.discountType.addDiscountInfo(this);
            }
        }
    }

    //</editor-fold>

    //<editor-fold name="common methods">

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
                ", discountType=" + discountType +
                '}';
    }

    //</editor-fold>

}