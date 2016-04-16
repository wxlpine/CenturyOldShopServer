/***********************************************************************
 * Module:  CommodityTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for CommodityType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class CommodityTypePK implements java.io.Serializable {
    /**
     * @pdOid ca41d35c-564d-44b6-b785-fc0f3d6de76b
     */
    private java.lang.String commodityType;

    /**
     * Empty constructor
     */
    public CommodityTypePK() {
    }

    /**
     * Constructor with parameters
     *
     * @param commodityType parameter to set value of field commodityType
     */
    public CommodityTypePK(java.lang.String commodityType) {
        this.commodityType = commodityType;
    }

    /**
     * Get value of commodityType
     *
     * @return commodityType
     */
    public java.lang.String getCommodityType() {
        return commodityType;
    }

    /**
     * Set value of commodityType
     *
     * @param newCommodityType
     */
    public void setCommodityType(java.lang.String newCommodityType) {
        this.commodityType = newCommodityType;
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

        CommodityTypePK cast = (CommodityTypePK) other;

        if (this.commodityType == null ? cast.getCommodityType() != this.commodityType : !this.commodityType.equals(cast.getCommodityType()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.commodityType != null)
            _hashCode = 29 * _hashCode + commodityType.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.CommodityTypePK: ");
        ret.append("commodityType='" + commodityType + "'");
        return ret.toString();
    }
}