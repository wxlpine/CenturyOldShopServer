/***********************************************************************
 * Module:  DiscountInfo.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid a85c5231-1f5c-43cd-8c62-325fdcd365b3
 */
public class DiscountInfo implements java.io.Serializable {
    /**
     * @pdOid e755ddf8-0c39-42c8-b177-eaeecae45b58
     */
    private long discountInfoId;
    /**
     * @pdOid 16cdbb7a-9b56-4a3c-8b09-7d24285f57a7
     */
    private java.lang.String title;
    /**
     * @pdOid 83f32084-f5d2-485d-beab-5cb0107b64ed
     */
    private java.util.Date discountStartTime;
    /**
     * null代表没有截止日期
     *
     * @pdOid 01f813ca-7c09-44cb-8827-6fb89e92876c
     */
    private java.util.Date discountEndTime;
    /**
     * 价格减免开始金额
     *
     * @pdOid 93eb1f59-b1a1-46c9-8b66-1734f3cc853e
     */
    private double priceReduceMinPrice;
    /**
     * 减免额度
     *
     * @pdOid bd8c6d20-1679-4586-8de6-94d2798277f3
     */
    private double priceReduceAmount;
    /**
     * 打折最低金额
     *
     * @pdOid 1651517a-418c-4172-b42d-cb28b42d90c6
     */
    private double discountMinPrice;
    /**
     * 折扣值，比如9折之类的
     *
     * @pdOid f12a756e-5304-44d0-8477-8adb4b5d3c00
     */
    private double discountRatio;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<Commodity> commodity;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopDiscountInfo mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=DiscountType assc=discountInfoDiscountType mult=1..1 side=A
     */
    private DiscountType discountType;

    /**
     * Get value of discountInfoId
     *
     * @return discountInfoId
     */
    public long getDiscountInfoId() {
        return discountInfoId;
    }

    /**
     * Set value of discountInfoId
     *
     * @param newDiscountInfoId
     */
    public void setDiscountInfoId(long newDiscountInfoId) {
        this.discountInfoId = newDiscountInfoId;
    }

    /**
     * Get value of title
     *
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Set value of title
     *
     * @param newTitle
     */
    public void setTitle(java.lang.String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get value of discountStartTime
     *
     * @return discountStartTime
     */
    public java.util.Date getDiscountStartTime() {
        return discountStartTime;
    }

    /**
     * Set value of discountStartTime
     *
     * @param newDiscountStartTime
     */
    public void setDiscountStartTime(java.util.Date newDiscountStartTime) {
        this.discountStartTime = newDiscountStartTime;
    }

    /**
     * Get value of discountEndTime
     *
     * @return discountEndTime
     */
    public java.util.Date getDiscountEndTime() {
        return discountEndTime;
    }

    /**
     * Set value of discountEndTime
     *
     * @param newDiscountEndTime
     */
    public void setDiscountEndTime(java.util.Date newDiscountEndTime) {
        this.discountEndTime = newDiscountEndTime;
    }

    /**
     * Get value of priceReduceMinPrice
     *
     * @return priceReduceMinPrice
     */
    public double getPriceReduceMinPrice() {
        return priceReduceMinPrice;
    }

    /**
     * Set value of priceReduceMinPrice
     *
     * @param newPriceReduceMinPrice
     */
    public void setPriceReduceMinPrice(double newPriceReduceMinPrice) {
        this.priceReduceMinPrice = newPriceReduceMinPrice;
    }

    /**
     * Get value of priceReduceAmount
     *
     * @return priceReduceAmount
     */
    public double getPriceReduceAmount() {
        return priceReduceAmount;
    }

    /**
     * Set value of priceReduceAmount
     *
     * @param newPriceReduceAmount
     */
    public void setPriceReduceAmount(double newPriceReduceAmount) {
        this.priceReduceAmount = newPriceReduceAmount;
    }

    /**
     * Get value of discountMinPrice
     *
     * @return discountMinPrice
     */
    public double getDiscountMinPrice() {
        return discountMinPrice;
    }

    /**
     * Set value of discountMinPrice
     *
     * @param newDiscountMinPrice
     */
    public void setDiscountMinPrice(double newDiscountMinPrice) {
        this.discountMinPrice = newDiscountMinPrice;
    }

    /**
     * Get value of discountRatio
     *
     * @return discountRatio
     */
    public double getDiscountRatio() {
        return discountRatio;
    }

    /**
     * Set value of discountRatio
     *
     * @param newDiscountRatio
     */
    public void setDiscountRatio(double newDiscountRatio) {
        this.discountRatio = newDiscountRatio;
    }

    /**
     * Get value of discountInfoPK.
     *
     * @return discountInfoPK object
     */
    public DiscountInfoPK getDiscountInfoPK() {
        return new DiscountInfoPK(discountInfoId);
    }

    /**
     * Set value of discountInfoPK.
     *
     * @param pk
     */
    public void setDiscountInfoPK(DiscountInfoPK pk) {
        if (pk != null) {
            this.discountInfoId = pk.getDiscountInfoId();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof DiscountInfo))
            return false;

        DiscountInfo cast = (DiscountInfo) other;

        if (this.discountInfoId != cast.getDiscountInfoId())
            return false;

        if (this.title == null ? cast.getTitle() != this.title : !this.title.equals(cast.getTitle()))
            return false;

        if (this.discountStartTime == null ? cast.getDiscountStartTime() != this.discountStartTime : !(com.sybase.orm.util.Util.compareDate(this.discountStartTime, cast.getDiscountStartTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.discountEndTime == null ? cast.getDiscountEndTime() != this.discountEndTime : !(com.sybase.orm.util.Util.compareDate(this.discountEndTime, cast.getDiscountEndTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (Double.doubleToLongBits(this.priceReduceMinPrice) != Double.doubleToLongBits(cast.getPriceReduceMinPrice()))
            return false;

        if (Double.doubleToLongBits(this.priceReduceAmount) != Double.doubleToLongBits(cast.getPriceReduceAmount()))
            return false;

        if (Double.doubleToLongBits(this.discountMinPrice) != Double.doubleToLongBits(cast.getDiscountMinPrice()))
            return false;

        if (Double.doubleToLongBits(this.discountRatio) != Double.doubleToLongBits(cast.getDiscountRatio()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(discountInfoId)).hashCode();
        if (this.title != null)
            hashCode = 29 * hashCode + title.hashCode();
        if (this.discountStartTime != null)
            hashCode = 29 * hashCode + discountStartTime.hashCode();
        if (this.discountEndTime != null)
            hashCode = 29 * hashCode + discountEndTime.hashCode();
        hashCode = 29 * hashCode + (new Double(priceReduceMinPrice)).hashCode();
        hashCode = 29 * hashCode + (new Double(priceReduceAmount)).hashCode();
        hashCode = 29 * hashCode + (new Double(discountMinPrice)).hashCode();
        hashCode = 29 * hashCode + (new Double(discountRatio)).hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DiscountInfo: ");
        ret.append("discountInfoId='" + discountInfoId + "'");
        ret.append("title='" + title + "'");
        ret.append("discountStartTime='" + discountStartTime + "'");
        ret.append("discountEndTime='" + discountEndTime + "'");
        ret.append("priceReduceMinPrice='" + priceReduceMinPrice + "'");
        ret.append("priceReduceAmount='" + priceReduceAmount + "'");
        ret.append("discountMinPrice='" + discountMinPrice + "'");
        ret.append("discountRatio='" + discountRatio + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<Commodity> getCommodity() {
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
    public void setCommodity(java.util.List<Commodity> newCommodity) {
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
        if (!this.commodity.contains(newCommodity))
            this.commodity.add(newCommodity);
    }

    /**
     * @param oldCommodity
     * @pdGenerated default remove
     */
    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.commodity != null)
            if (this.commodity.contains(oldCommodity))
                this.commodity.remove(oldCommodity);
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllCommodity() {
        if (commodity != null)
            commodity.clear();
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.List<OrderForm> getOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm.iterator();
    }

    /**
     * @param newOrderForm
     * @pdGenerated default setter
     */
    public void setOrderForm(java.util.List<OrderForm> newOrderForm) {
        //removeAllOrderForm();
        this.orderForm = newOrderForm;
    }

    /**
     * @param newOrderForm
     * @pdGenerated default add
     */
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

    /**
     * @param oldOrderForm
     * @pdGenerated default remove
     */
    public void removeOrderForm(OrderForm oldOrderForm) {
        if (oldOrderForm == null)
            return;
        if (this.orderForm != null)
            if (this.orderForm.contains(oldOrderForm)) {
                this.orderForm.remove(oldOrderForm);
                oldOrderForm.setDiscountInfo((DiscountInfo) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllOrderForm() {
        if (orderForm != null) {
            OrderForm oldOrderForm;
            for (java.util.Iterator iter = getIteratorOrderForm(); iter.hasNext(); ) {
                oldOrderForm = (OrderForm) iter.next();
                iter.remove();
                oldOrderForm.setDiscountInfo((DiscountInfo) null);
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
                //oldShop.removeDiscountInfo(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addDiscountInfo(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * @param newDiscountType
     * @pdGenerated default parent setter
     */
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public DiscountInfo() {
    }

}