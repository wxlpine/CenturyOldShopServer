/***********************************************************************
 * Module:  OrderFormCommodity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderFormCommodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid e18de110-7a98-4066-9c32-219fe303a587
 */
public class OrderFormCommodity implements java.io.Serializable {

    private OrderFormCommodityPK id;

    /**
     * @pdOid fac1d3cd-eb22-4eb8-a381-65413c344b01
     */
    private double buyPrice;
    /**
     * @pdOid f6839c19-b4c5-4074-845b-fed8562ef8e3
     */
    private int buyAmount;

    private OrderForm orderForm;
    private Commodity commodity;

    public OrderFormCommodityPK getId() {
        return id;
    }

    public OrderFormCommodity setId(OrderFormCommodityPK id) {
        this.id = id;
        return this;
    }

    public OrderForm getOrderForm() {
        return orderForm;
    }

    public OrderFormCommodity setOrderForm(OrderForm orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public OrderFormCommodity setCommodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    /**
     * Get value of buyPrice
     *
     * @return buyPrice
     */
    public double getBuyPrice() {
        return buyPrice;
    }

    /**
     * Set value of buyPrice
     *
     * @param newBuyPrice
     */
    public void setBuyPrice(double newBuyPrice) {
        this.buyPrice = newBuyPrice;
    }

    /**
     * Get value of buyAmount
     *
     * @return buyAmount
     */
    public int getBuyAmount() {
        return buyAmount;
    }

    /**
     * Set value of buyAmount
     *
     * @param newBuyAmount
     */
    public void setBuyAmount(int newBuyAmount) {
        this.buyAmount = newBuyAmount;
    }

    /**
     * Get value of orderFormCommodityPK.
     *
     * @return orderFormCommodityPK object
     */
    public OrderFormCommodityPK getOrderFormCommodityPK() {
        return new OrderFormCommodityPK();
    }

    /**
     * Set value of orderFormCommodityPK.
     *
     * @param pk
     */
    public void setOrderFormCommodityPK(OrderFormCommodityPK pk) {
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof OrderFormCommodity))
            return false;

        OrderFormCommodity cast = (OrderFormCommodity) other;

        if (Double.doubleToLongBits(this.buyPrice) != Double.doubleToLongBits(cast.getBuyPrice()))
            return false;

        if (this.buyAmount != cast.getBuyAmount())
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Double(buyPrice)).hashCode();
        hashCode = 29 * hashCode + (new Integer(buyAmount)).hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.OrderFormCommodity: ");
        ret.append("buyPrice='" + buyPrice + "'");
        ret.append("buyAmount='" + buyAmount + "'");
        return ret.toString();
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public OrderFormCommodity() {
    }

}