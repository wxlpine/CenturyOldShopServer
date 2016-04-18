/***********************************************************************
 * Module:  OrderStatusTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for OrderStatusType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class OrderStatusTypePK implements java.io.Serializable {
    /**
     * @pdOid 5a6ad6b3-e960-4853-aad8-c86ca1d73dc2
     */
    private java.lang.String orderStatusType;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public OrderStatusTypePK() {
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    /**
     * Constructor with parameters
     *
     * @param orderStatusType parameter to set value of field orderStatusType
     */
    public OrderStatusTypePK(java.lang.String orderStatusType) {
        this.orderStatusType = orderStatusType;
    }

    /**
     * Get value of orderStatusType
     *
     * @return orderStatusType
     */
    public java.lang.String getOrderStatusType() {
        return orderStatusType;
    }

    /**
     * Set value of orderStatusType
     *
     * @param newOrderStatusType
     */
    public void setOrderStatusType(java.lang.String newOrderStatusType) {
        this.orderStatusType = newOrderStatusType;
    }


    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatusTypePK that = (OrderStatusTypePK) o;
        return Objects.equals(orderStatusType, that.orderStatusType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatusType);
    }

    @Override
    public String toString() {
        return "OrderStatusTypePK{" +
                "orderStatusType='" + orderStatusType + '\'' +
                '}';
    }

    //</editor-fold>
}