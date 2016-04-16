/***********************************************************************
 * Module:  DisputeStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid eb18f615-d7d0-4640-a782-cc8f382e95cc
 */
public class DisputeStatusType implements java.io.Serializable {
    /**
     * @pdOid d1ef8a09-060f-4b2a-bea4-f5d3f485cfb3
     */
    private java.lang.String disputeStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=disputeStatusTypeOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<OrderForm> orderForm;

    /**
     * Get value of disputeStatusType
     *
     * @return disputeStatusType
     */
    public java.lang.String getDisputeStatusType() {
        return disputeStatusType;
    }

    /**
     * Set value of disputeStatusType
     *
     * @param newDisputeStatusType
     */
    public void setDisputeStatusType(java.lang.String newDisputeStatusType) {
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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof DisputeStatusType))
            return false;

        DisputeStatusType cast = (DisputeStatusType) other;

        if (this.disputeStatusType == null ? cast.getDisputeStatusType() != this.disputeStatusType : !this.disputeStatusType.equals(cast.getDisputeStatusType()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        if (this.disputeStatusType != null)
            hashCode = 29 * hashCode + disputeStatusType.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DisputeStatusType: ");
        ret.append("disputeStatusType='" + disputeStatusType + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<OrderForm> getOrderForm() {
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
    public void setOrderForm(java.util.List<OrderForm> newOrderForm) {
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public DisputeStatusType() {
    }

}