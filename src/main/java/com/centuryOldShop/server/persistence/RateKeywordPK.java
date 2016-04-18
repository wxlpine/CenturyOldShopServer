/***********************************************************************
 * Module:  RateKeywordPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for RateKeyword. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class RateKeywordPK implements java.io.Serializable {
    /**
     * @pdOid 342aed0f-deac-40b5-a181-c8c1ea37e53c
     */
    private String rateKeyword;

    /**
     * Empty constructor
     */
    public RateKeywordPK() {
    }

    //<editor-fold name="accessor">


    /**
     * Constructor with parameters
     *
     * @param rateKeyword parameter to set value of field rateKeyword
     */
    public RateKeywordPK(String rateKeyword) {
        this.rateKeyword = rateKeyword;
    }

    /**
     * Get value of rateKeyword
     *
     * @return rateKeyword
     */
    public String getRateKeyword() {
        return rateKeyword;
    }

    /**
     * Set value of rateKeyword
     *
     * @param newRateKeyword
     */
    public void setRateKeyword(String newRateKeyword) {
        this.rateKeyword = newRateKeyword;
    }


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateKeywordPK that = (RateKeywordPK) o;
        return Objects.equals(rateKeyword, that.rateKeyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateKeyword);
    }

    @Override
    public String toString() {
        return "RateKeywordPK{" +
                "rateKeyword='" + rateKeyword + '\'' +
                '}';
    }

    //</editor-fold>
}