/***********************************************************************
 * Module:  OrderFormCommodityPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class OrderFormCommodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Generated primary key class for OrderFormCommodity. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
@Embeddable
public class OrderFormCommodityPK implements java.io.Serializable {

    @Column(name="orderFormId")
    private long orderFormId;

    @Column(name="commodityId")
    private long commodityId;
    /**
     * Empty constructor
     */
    public OrderFormCommodityPK() {
    }

    public OrderFormCommodityPK(long orderFormId, long commodityId) {
        this.orderFormId = orderFormId;
        this.commodityId = commodityId;
    }

    public long getOrderFormId() {
        return orderFormId;
    }

    public OrderFormCommodityPK setOrderFormId(long orderFormId) {
        this.orderFormId = orderFormId;
        return this;
    }

    public long getCommodityId() {
        return commodityId;
    }

    public OrderFormCommodityPK setCommodityId(long commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderFormCommodityPK that = (OrderFormCommodityPK) o;

        if (orderFormId != that.orderFormId) return false;
        return commodityId == that.commodityId;

    }

    @Override
    public int hashCode() {
        int result = (int) (orderFormId ^ (orderFormId >>> 32));
        result = 31 * result + (int) (commodityId ^ (commodityId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "OrderFormCommodityPK{" +
                "orderFormId=" + orderFormId +
                ", commodityId=" + commodityId +
                '}';
    }
}