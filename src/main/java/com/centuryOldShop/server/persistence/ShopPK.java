/***********************************************************************
 * Module:  ShopPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for Shop. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopPK implements java.io.Serializable {
    /**
     * @pdOid d7d4744a-2b76-4a9c-88e9-2600741a34d4
     */
    private long shopId;

    /**
     * Empty constructor
     */
    public ShopPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopId parameter to set value of field shopId
     */
    public ShopPK(long shopId) {
        this.shopId = shopId;
    }

    /**
     * Get value of shopId
     *
     * @return shopId
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Set value of shopId
     *
     * @param newShopId
     */
    public void setShopId(long newShopId) {
        this.shopId = newShopId;
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

        ShopPK cast = (ShopPK) other;

        if (this.shopId != cast.getShopId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(shopId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopPK: ");
        ret.append("shopId='" + shopId + "'");
        return ret.toString();
    }
}