/***********************************************************************
 * Module:  CommodityPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for Commodity. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class CommodityPK implements java.io.Serializable {
    /**
     * @pdOid 4270790d-bb28-42b8-9085-303cff9b5447
     */
    private long commodityId;

    /**
     * Empty constructor
     */
    public CommodityPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param commodityId parameter to set value of field commodityId
     */
    public CommodityPK(long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * Get value of commodityId
     *
     * @return commodityId
     */
    public long getCommodityId() {
        return commodityId;
    }

    /**
     * Set value of commodityId
     *
     * @param newCommodityId
     */
    public void setCommodityId(long newCommodityId) {
        this.commodityId = newCommodityId;
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

        CommodityPK cast = (CommodityPK) other;

        if (this.commodityId != cast.getCommodityId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(commodityId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.CommodityPK: ");
        ret.append("commodityId='" + commodityId + "'");
        return ret.toString();
    }
}