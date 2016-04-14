package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderFormCommodityEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderFormCommodityEntity
 ***********************************************************************/

import java.io.Serializable;

/**
 * @pdOid cec92b6e-ddf8-4503-86ff-64de391c4f56
 */
public class OrderFormCommodityEntity implements Serializable {
    /**
     * @pdOid c4c50301-b1e9-4772-b371-c073aec64eb6
     */
    private double buyPrice;
    /**
     * @pdOid 9ee3e54a-7662-4008-aed9-e2c59c08ce16
     */
    private int buyAmount;

    private OrderFormEntity orderForm;
    private CommodityEntity commodity;

    //<editor-fold desc="constructor">
    public OrderFormCommodityEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public double getBuyPrice() {
        return buyPrice;
    }

    public OrderFormCommodityEntity setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public OrderFormCommodityEntity setBuyAmount(int buyAmount) {
        this.buyAmount = buyAmount;
        return this;
    }

    public OrderFormEntity getOrderForm() {
        return orderForm;
    }

    public OrderFormCommodityEntity setOrderForm(OrderFormEntity orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public CommodityEntity getCommodity() {
        return commodity;
    }

    public OrderFormCommodityEntity setCommodity(CommodityEntity commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderFormCommodityEntity that = (OrderFormCommodityEntity) o;

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
        return "OrderFormCommodityEntity{" +
                "buyPrice=" + buyPrice +
                ", buyAmount=" + buyAmount +
                ", orderForm=" + orderForm +
                ", commodity=" + commodity +
                '}';
    }

    //</editor-fold>
}