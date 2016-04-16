/***********************************************************************
 * Module:  DisputeStatusTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for DisputeStatusType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class DisputeStatusTypePK implements java.io.Serializable {
    /**
     * @pdOid d1ef8a09-060f-4b2a-bea4-f5d3f485cfb3
     */
    private java.lang.String disputeStatusType;

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
    public DisputeStatusTypePK(java.lang.String disputeStatusType) {
        this.disputeStatusType = disputeStatusType;
    }

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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        DisputeStatusTypePK cast = (DisputeStatusTypePK) other;

        if (this.disputeStatusType == null ? cast.getDisputeStatusType() != this.disputeStatusType : !this.disputeStatusType.equals(cast.getDisputeStatusType()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.disputeStatusType != null)
            _hashCode = 29 * _hashCode + disputeStatusType.hashCode();
        return _hashCode;
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
}