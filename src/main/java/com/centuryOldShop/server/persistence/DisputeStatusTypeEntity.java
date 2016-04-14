package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DisputeStatusTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class DisputeStatusTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid 3c96e63c-c8e9-4ce0-8f10-3f04e0998b97
 */
public class DisputeStatusTypeEntity implements Serializable {
    /**
     * @pdOid 11b9d363-56b4-4b13-ae5e-7337d88a17d1
     */
    private String disputeStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=disputeStatusTypeOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderFormEntity> orderForm;

    //<editor-fold desc="constructor">
    public DisputeStatusTypeEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getDisputeStatusType() {
        return disputeStatusType;
    }

    public DisputeStatusTypeEntity setDisputeStatusType(String disputeStatusType) {
        this.disputeStatusType = disputeStatusType;
        return this;
    }

    public List<OrderFormEntity> getOrderForm() {
        return orderForm;
    }

    public DisputeStatusTypeEntity setOrderForm(List<OrderFormEntity> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisputeStatusTypeEntity that = (DisputeStatusTypeEntity) o;

        return disputeStatusType != null ? disputeStatusType.equals(that.disputeStatusType) : that.disputeStatusType == null;

    }

    @Override
    public int hashCode() {
        return disputeStatusType != null ? disputeStatusType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "DisputeStatusTypeEntity{" +
                "disputeStatusType='" + disputeStatusType + '\'' +
                '}';
    }
    //</editor-fold>
}