/***********************************************************************
 * Module:  DisputeStatusTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for DisputeStatusType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class DisputeStatusTypePK implements java.io.Serializable {
    /**
     * @pdOid d1ef8a09-060f-4b2a-bea4-f5d3f485cfb3
     */
    private String disputeStatusType;

    /**
     * Empty constructor
     */
    public DisputeStatusTypePK() {
    }

    /**
     * Constructor with parameters
     *
     * @param disputeStatusType parameter to set value of field disputeStatusType
     */
    public DisputeStatusTypePK(String disputeStatusType) {
        this.disputeStatusType = disputeStatusType;
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

    /**
     * Set value of disputeStatusType
     *
     * @param newDisputeStatusType
     */
    public void setDisputeStatusType(String newDisputeStatusType) {
        this.disputeStatusType = newDisputeStatusType;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisputeStatusTypePK that = (DisputeStatusTypePK) o;
        return Objects.equals(disputeStatusType, that.disputeStatusType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disputeStatusType);
    }

    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DisputeStatusTypePK: ");
        ret.append("disputeStatusType='" + disputeStatusType + "'");
        return ret.toString();
    }

    //</editor-fold>
}