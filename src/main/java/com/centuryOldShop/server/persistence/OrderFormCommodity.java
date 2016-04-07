package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderFormCommodity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderFormCommodity
 ***********************************************************************/

import java.io.Serializable;

/**
 * @pdOid cec92b6e-ddf8-4503-86ff-64de391c4f56
 */
public class OrderFormCommodity implements Serializable {
    /**
     * @pdOid c4c50301-b1e9-4772-b371-c073aec64eb6
     */
    private double buyPrice;
    /**
     * @pdOid 9ee3e54a-7662-4008-aed9-e2c59c08ce16
     */
    private int buyAmount;

    private OrderForm orderForm;
    private Commodity commodity;

    //<editor-fold desc="constructor">
    public OrderFormCommodity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public double getBuyPrice() {
        return buyPrice;
    }

    public OrderFormCommodity setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public OrderFormCommodity setBuyAmount(int buyAmount) {
        this.buyAmount = buyAmount;
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

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderFormCommodity that = (OrderFormCommodity) o;

        if (orderForm != null ? !orderForm.equals(that.orderForm) : that.orderForm != null) return false;
        return commodity != null ? commodity.equals(that.commodity) : that.commodity == null;

    }

    @Override
    public int hashCode() {
        int result = orderForm != null ? orderForm.hashCode() : 0;
        result = 31 * result + (commodity != null ? commodity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderFormCommodity{" +
                "buyPrice=" + buyPrice +
                ", buyAmount=" + buyAmount +
                ", orderForm=" + orderForm +
                ", commodity=" + commodity +
                '}';
    }

    //</editor-fold>
}