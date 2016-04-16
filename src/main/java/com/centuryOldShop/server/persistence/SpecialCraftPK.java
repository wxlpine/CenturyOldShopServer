/***********************************************************************
 * Module:  SpecialCraftPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for SpecialCraft. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class SpecialCraftPK implements java.io.Serializable {
    /**
     * @pdOid c4d4b323-fc18-4ce6-b6b1-8675d95fcb47
     */
    private long specialCraftId;

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

        SpecialCraftPK cast = (SpecialCraftPK) other;

        if (this.specialCraftId != cast.getSpecialCraftId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(specialCraftId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.SpecialCraftPK: ");
        ret.append("specialCraftId='" + specialCraftId + "'");
        return ret.toString();
    }
}