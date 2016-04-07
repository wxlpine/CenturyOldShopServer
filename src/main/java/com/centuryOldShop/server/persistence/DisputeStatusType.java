package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DisputeStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class DisputeStatusType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid 3c96e63c-c8e9-4ce0-8f10-3f04e0998b97
 */
public class DisputeStatusType implements Serializable {
    /**
     * @pdOid 11b9d363-56b4-4b13-ae5e-7337d88a17d1
     */
    private String disputeStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=disputeStatusTypeOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;

    //<editor-fold desc="constructor">
    public DisputeStatusType() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getDisputeStatusType() {
        return disputeStatusType;
    }

    public DisputeStatusType setDisputeStatusType(String disputeStatusType) {
        this.disputeStatusType = disputeStatusType;
        return this;
    }

    public List<OrderForm> getOrderForm() {
        return orderForm;
    }

    public DisputeStatusType setOrderForm(List<OrderForm> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisputeStatusType that = (DisputeStatusType) o;

        return disputeStatusType != null ? disputeStatusType.equals(that.disputeStatusType) : that.disputeStatusType == null;

    }

    @Override
    public int hashCode() {
        return disputeStatusType != null ? disputeStatusType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "DisputeStatusType{" +
                "disputeStatusType='" + disputeStatusType + '\'' +
                '}';
    }
    //</editor-fold>
}