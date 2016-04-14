package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderStatusTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderStatusTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid c223fab8-1304-4fb2-a6db-0a747e430b64
 */
public class OrderStatusTypeEntity implements Serializable {
    /**
     * @pdOid be285f03-5d31-4529-9d09-c2aefbfe8732
     */
    private String orderStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormOrderStatusType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderFormEntity> orderForm;

    //<editor-fold desc="constructor">
    public OrderStatusTypeEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getOrderStatusType() {
        return orderStatusType;
    }

    public OrderStatusTypeEntity setOrderStatusType(String orderStatusType) {
        this.orderStatusType = orderStatusType;
        return this;
    }

    public List<OrderFormEntity> getOrderForm() {
        return orderForm;
    }

    public OrderStatusTypeEntity setOrderForm(List<OrderFormEntity> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderStatusTypeEntity that = (OrderStatusTypeEntity) o;

        return orderStatusType != null ? orderStatusType.equals(that.orderStatusType) : that.orderStatusType == null;

    }

    @Override
    public int hashCode() {
        return orderStatusType != null ? orderStatusType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderStatusTypeEntity{" +
                "orderStatusType='" + orderStatusType + '\'' +
                '}';
    }

    //</editor-fold>

}