/***********************************************************************
 * Module:  SpecialCraftPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for SpecialCraft. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class SpecialCraftPK implements java.io.Serializable {
    /**
     * @pdOid c4d4b323-fc18-4ce6-b6b1-8675d95fcb47
     */
    private long specialCraftId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public SpecialCraftPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param specialCraftId parameter to set value of field specialCraftId
     */
    public SpecialCraftPK(long specialCraftId) {
        this.specialCraftId = specialCraftId;
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    /**
     * Get value of specialCraftId
     *
     * @return specialCraftId
     */
    public long getSpecialCraftId() {
        return specialCraftId;
    }

    /**
     * Set value of specialCraftId
     *
     * @param newSpecialCraftId
     */
    public void setSpecialCraftId(long newSpecialCraftId) {
        this.specialCraftId = newSpecialCraftId;
    }

    //</editor-fold>

    //<editor-fold name="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialCraftPK that = (SpecialCraftPK) o;
        return specialCraftId == that.specialCraftId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialCraftId);
    }

    @Override
    public String toString() {
        return "SpecialCraftPK{" +
                "specialCraftId=" + specialCraftId +
                '}';
    }

    //</editor-fold>

}