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

    private OrderFormCommodityPK orderFormCommodityPK;

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

    /**
     * Empty constructor which is required by Hibernate
     */
    public OrderFormCommodity() {
    }

    //<editor-fold name="accessor">

    public OrderFormCommodityPK getOrderFormCommodityPK() {
        return orderFormCommodityPK;
    }

    public OrderFormCommodity setOrderFormCommodityPK(OrderFormCommodityPK id) {
        this.orderFormCommodityPK = id;
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
     */
    public void setBuyAmount(int newBuyAmount) {
        this.buyAmount = newBuyAmount;
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "OrderFormCommodity{" +
                "orderFormCommodityPK=" + orderFormCommodityPK +
                ", buyPrice=" + buyPrice +
                ", buyAmount=" + buyAmount +
                '}';
    }

    //</editor-fold>

}