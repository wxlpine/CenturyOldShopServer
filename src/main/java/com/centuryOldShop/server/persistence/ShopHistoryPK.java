/***********************************************************************
 * Module:  ShopHistoryPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for ShopHistory. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopHistoryPK implements java.io.Serializable {
    /**
     * @pdOid c054dd98-6629-4f2d-a8a6-94ecfca57ec9
     */
    private long shopHistoryId;

    /**
     * Empty constructor
     */
    public ShopHistoryPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopHistoryId parameter to set value of field shopHistoryId
     */
    public ShopHistoryPK(long shopHistoryId) {
        this.shopHistoryId = shopHistoryId;
    }

    /**
     * Get value of shopHistoryId
     *
     * @return shopHistoryId
     */
    public long getShopHistoryId() {
        return shopHistoryId;
    }

    /**
     * Set value of shopHistoryId
     *
     * @param newShopHistoryId
     */
    public void setShopHistoryId(long newShopHistoryId) {
        this.shopHistoryId = newShopHistoryId;
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

        ShopHistoryPK cast = (ShopHistoryPK) other;

        if (this.shopHistoryId != cast.getShopHistoryId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(shopHistoryId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopHistoryPK: ");
        ret.append("shopHistoryId='" + shopHistoryId + "'");
        return ret.toString();
    }
}