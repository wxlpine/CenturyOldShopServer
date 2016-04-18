/***********************************************************************
 * Module:  DisputeStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid eb18f615-d7d0-4640-a782-cc8f382e95cc
 */
public class DisputeStatusType implements java.io.Serializable {
    /**
     * @pdOid d1ef8a09-060f-4b2a-bea4-f5d3f485cfb3
     */
    private String disputeStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=disputeStatusTypeOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;


    /**
     * Empty constructor which is required by Hibernate
     */
    public DisputeStatusType() {
    }


    //<editor-fold name="accessor">

    /**
     * Get value of disputeStatusType
     *
     * @return disputeStatusType
     */
    public String getDisputeStatusType() {
        return disputeStatusType;
    }

    public void setDisputeStatusType(String newDisputeStatusType) {
        this.disputeStatusType = newDisputeStatusType;
    }

    /**
     * Get value of disputeStatusTypePK.
     *
     * @return disputeStatusTypePK object
     */
    public DisputeStatusTypePK getDisputeStatusTypePK() {
        return new DisputeStatusTypePK(disputeStatusType);
    }

    /**
     * Set value of disputeStatusTypePK.
     *
     * @param pk
     */
    public void setDisputeStatusTypePK(DisputeStatusTypePK pk) {
        if (pk != null) {
            this.disputeStatusType = pk.getDisputeStatusType();
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
            newOrderForm.setDisputeStatusType(this);
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
                oldOrderForm.setDisputeStatusType((DisputeStatusType) null);
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
                oldOrderForm.setDisputeStatusType((DisputeStatusType) null);
            }
        }
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "DisputeStatusType{" +
                "disputeStatusType='" + disputeStatusType + '\'' +
                '}';
    }

    //</editor-fold>


}