/***********************************************************************
 * Module:  CommodityType.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid dfc97029-3bed-48f3-8743-313208c78eaa
 */
public class CommodityType implements java.io.Serializable {
    /**
     * @pdOid ca41d35c-564d-44b6-b785-fc0f3d6de76b
     */
    private java.lang.String commodityType;


    /**
     * Empty constructor which is required by Hibernate
     */
    public CommodityType() {
    }

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityCommodityType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;

    //<editor-fold name="accessor">

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


    /**
     * @pdGenerated default getter
     */
    public List<Commodity> getCommodity() {
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
    public void setCommodity(List<Commodity> newCommodity) {
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

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "CommodityType{" +
                "commodityType='" + commodityType + '\'' +
                '}';
    }

    //</editor-fold>


}