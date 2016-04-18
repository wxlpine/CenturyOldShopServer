/***********************************************************************
 * Module:  OrderFormPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for OrderForm. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class OrderFormPK implements java.io.Serializable {
    /**
     * @pdOid a2d57ee1-17f0-4bcb-9abc-bafe6623b523
     */
    private long orderFormId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public OrderFormPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param orderFormId parameter to set value of field orderFormId
     */
    public OrderFormPK(long orderFormId) {
        this.orderFormId = orderFormId;
    }

    //</editor-fold>

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

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderFormPK that = (OrderFormPK) o;
        return orderFormId == that.orderFormId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderFormId);
    }

    @Override
    public String toString() {
        return "OrderFormPK{" +
                "orderFormId=" + orderFormId +
                '}';
    }

    //</editor-fold>
}