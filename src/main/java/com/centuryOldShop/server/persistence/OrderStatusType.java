/***********************************************************************
 * Module:  OrderStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid ea646d3b-99bf-4c5a-a49f-be94e5cc11be
 */
public class OrderStatusType implements java.io.Serializable {
    /**
     * @pdOid 5a6ad6b3-e960-4853-aad8-c86ca1d73dc2
     */
    private String orderStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormOrderStatusType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;

    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public OrderStatusType() {
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    /**
     * Get value of orderStatusType
     *
     * @return orderStatusType
     */
    public String getOrderStatusType() {
        return orderStatusType;
    }

    /**
     * Set value of orderStatusType
     *
     * @param newOrderStatusType
     */
    public void setOrderStatusType(String newOrderStatusType) {
        this.orderStatusType = newOrderStatusType;
    }

    /**
     * Get value of orderStatusTypePK.
     *
     * @return orderStatusTypePK object
     */
    public OrderStatusTypePK getOrderStatusTypePK() {
        return new OrderStatusTypePK(orderStatusType);
    }

    /**
     * Set value of orderStatusTypePK.
     *
     * @param pk
     */
    public void setOrderStatusTypePK(OrderStatusTypePK pk) {
        if (pk != null) {
            this.orderStatusType = pk.getOrderStatusType();
        }
    }


    /**
     * @pdGenerated default getter
     */
    public List<OrderForm> getOrderForm() {
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
    public void setOrderForm(List<OrderForm> newOrderForm) {
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
            newOrderForm.setOrderStatusType(this);
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
                oldOrderForm.setOrderStatusType((OrderStatusType) null);
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
                oldOrderForm.setOrderStatusType((OrderStatusType) null);
            }
        }
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "OrderStatusType{" +
                "orderStatusType='" + orderStatusType + '\'' +
                '}';
    }

    //</editor-fold>



}