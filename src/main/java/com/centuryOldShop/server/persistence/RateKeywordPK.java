/***********************************************************************
 * Module:  RateKeywordPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for RateKeyword. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class RateKeywordPK implements java.io.Serializable {
    /**
     * @pdOid 342aed0f-deac-40b5-a181-c8c1ea37e53c
     */
    private java.lang.String rateKeyword;

    /**
     * Empty constructor
     */
    public RateKeywordPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param rateKeyword parameter to set value of field rateKeyword
     */
    public RateKeywordPK(java.lang.String rateKeyword) {
        this.rateKeyword = rateKeyword;
    }

    /**
     * Get value of rateKeyword
     *
     * @return rateKeyword
     */
    public java.lang.String getRateKeyword() {
        return rateKeyword;
    }

    /**
     * Set value of rateKeyword
     *
     * @param newRateKeyword
     */
    public void setRateKeyword(java.lang.String newRateKeyword) {
        this.rateKeyword = newRateKeyword;
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

        RateKeywordPK cast = (RateKeywordPK) other;

        if (this.rateKeyword == null ? cast.getRateKeyword() != this.rateKeyword : !this.rateKeyword.equals(cast.getRateKeyword()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.rateKeyword != null)
            _hashCode = 29 * _hashCode + rateKeyword.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.RateKeywordPK: ");
        ret.append("rateKeyword='" + rateKeyword + "'");
        return ret.toString();
    }
}