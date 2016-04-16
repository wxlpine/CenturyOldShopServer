/***********************************************************************
 * Module:  ShopTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for ShopType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopTypePK implements java.io.Serializable {
    /**
     * @pdOid c9a9711d-7338-40fa-be2f-b29ed6e7b5cb
     */
    private java.lang.String shopTypeName;

    /**
     * Empty constructor
     */
    public ShopTypePK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopTypeName parameter to set value of field shopTypeName
     */
    public ShopTypePK(java.lang.String shopTypeName) {
        this.shopTypeName = shopTypeName;
    }

    /**
     * Get value of shopTypeName
     *
     * @return shopTypeName
     */
    public java.lang.String getShopTypeName() {
        return shopTypeName;
    }

    /**
     * Set value of shopTypeName
     *
     * @param newShopTypeName
     */
    public void setShopTypeName(java.lang.String newShopTypeName) {
        this.shopTypeName = newShopTypeName;
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

        ShopTypePK cast = (ShopTypePK) other;

        if (this.shopTypeName == null ? cast.getShopTypeName() != this.shopTypeName : !this.shopTypeName.equals(cast.getShopTypeName()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.shopTypeName != null)
            _hashCode = 29 * _hashCode + shopTypeName.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopTypePK: ");
        ret.append("shopTypeName='" + shopTypeName + "'");
        return ret.toString();
    }
}