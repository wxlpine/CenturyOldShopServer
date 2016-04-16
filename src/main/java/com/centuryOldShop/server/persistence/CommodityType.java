/***********************************************************************
 * Module:  CommodityType.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid dfc97029-3bed-48f3-8743-313208c78eaa
 */
public class CommodityType implements java.io.Serializable {
    /**
     * @pdOid ca41d35c-564d-44b6-b785-fc0f3d6de76b
     */
    private java.lang.String commodityType;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityCommodityType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<Commodity> commodity;

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

    /**
     * Get value of commodityTypePK.
     *
     * @return commodityTypePK object
     */
    public CommodityTypePK getCommodityTypePK() {
        return new CommodityTypePK(commodityType);
    }

    /**
     * Set value of commodityTypePK.
     *
     * @param pk
     */
    public void setCommodityTypePK(CommodityTypePK pk) {
        if (pk != null) {
            this.commodityType = pk.getCommodityType();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof CommodityType))
            return false;

        CommodityType cast = (CommodityType) other;

        if (this.commodityType == null ? cast.getCommodityType() != this.commodityType : !this.commodityType.equals(cast.getCommodityType()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        if (this.commodityType != null)
            hashCode = 29 * hashCode + commodityType.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.CommodityType: ");
        ret.append("commodityType='" + commodityType + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<Commodity> getCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity.iterator();
    }

    /**
     * @param newCommodity
     * @pdGenerated default setter
     */
    public void setCommodity(java.util.List<Commodity> newCommodity) {
        //removeAllCommodity();
        this.commodity = newCommodity;
    }

    /**
     * @param newCommodity
     * @pdGenerated default add
     */
    public void addCommodity(Commodity newCommodity) {
        if (newCommodity == null)
            return;
        if (this.commodity == null)
            this.commodity = new java.util.ArrayList<Commodity>();
        if (!this.commodity.contains(newCommodity)) {
            this.commodity.add(newCommodity);
            newCommodity.setCommodityType(this);
        }
    }

    /**
     * @param oldCommodity
     * @pdGenerated default remove
     */
    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.commodity != null)
            if (this.commodity.contains(oldCommodity)) {
                this.commodity.remove(oldCommodity);
                oldCommodity.setCommodityType((CommodityType) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllCommodity() {
        if (commodity != null) {
            Commodity oldCommodity;
            for (java.util.Iterator iter = getIteratorCommodity(); iter.hasNext(); ) {
                oldCommodity = (Commodity) iter.next();
                iter.remove();
                oldCommodity.setCommodityType((CommodityType) null);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public CommodityType() {
    }

}