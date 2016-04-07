package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderStatusType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid c223fab8-1304-4fb2-a6db-0a747e430b64
 */
public class OrderStatusType implements Serializable {
    /**
     * @pdOid be285f03-5d31-4529-9d09-c2aefbfe8732
     */
    private String orderStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormOrderStatusType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;

    //<editor-fold desc="constructor">
    public OrderStatusType() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getOrderStatusType() {
        return orderStatusType;
    }

    public OrderStatusType setOrderStatusType(String orderStatusType) {
        this.orderStatusType = orderStatusType;
        return this;
    }

    public List<OrderForm> getOrderForm() {
        return orderForm;
    }

    public OrderStatusType setOrderForm(List<OrderForm> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderStatusType that = (OrderStatusType) o;

        return orderStatusType != null ? orderStatusType.equals(that.orderStatusType) : that.orderStatusType == null;

    }

    @Override
    public int hashCode() {
        return orderStatusType != null ? orderStatusType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderStatusType{" +
                "orderStatusType='" + orderStatusType + '\'' +
                '}';
    }

    //</editor-fold>

}