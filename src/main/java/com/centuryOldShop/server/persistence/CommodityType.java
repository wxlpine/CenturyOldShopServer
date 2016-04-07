package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  CommodityType.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid 21155406-14eb-422a-9588-b971854d9418
 */
public class CommodityType implements Serializable {
    /**
     * @pdOid c9f763bc-c6b9-4c2d-afaf-3078b4972d36
     */
    private String commodityType;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityCommodityType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;

    //<editor-fold desc="constructor">
    public CommodityType() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public String getCommodityType() {
        return commodityType;
    }

    public CommodityType setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public CommodityType setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommodityType that = (CommodityType) o;

        return commodityType != null ? commodityType.equals(that.commodityType) : that.commodityType == null;

    }

    @Override
    public int hashCode() {
        return commodityType != null ? commodityType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CommodityType{" +
                "commodityType='" + commodityType + '\'' +
                '}';
    }
    //</editor-fold>


}