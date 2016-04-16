/***********************************************************************
 * Module:  ShopAreaPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for ShopArea. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopAreaPK implements java.io.Serializable {
    /**
     * @pdOid e1b625ba-97a1-4473-a7e6-d692abfa826d
     */
    private long shopAreaId;

    /**
     * Empty constructor
     */
    public ShopAreaPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopAreaId parameter to set value of field shopAreaId
     */
    public ShopAreaPK(long shopAreaId) {
        this.shopAreaId = shopAreaId;
    }

    /**
     * Get value of shopAreaId
     *
     * @return shopAreaId
     */
    public long getShopAreaId() {
        return shopAreaId;
    }

    /**
     * Set value of shopAreaId
     *
     * @param newShopAreaId
     */
    public void setShopAreaId(long newShopAreaId) {
        this.shopAreaId = newShopAreaId;
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

        ShopAreaPK cast = (ShopAreaPK) other;

        if (this.shopAreaId != cast.getShopAreaId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(shopAreaId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopAreaPK: ");
        ret.append("shopAreaId='" + shopAreaId + "'");
        return ret.toString();
    }
}