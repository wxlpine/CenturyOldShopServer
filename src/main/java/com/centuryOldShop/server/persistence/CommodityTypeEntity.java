package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  CommodityTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid 21155406-14eb-422a-9588-b971854d9418
 */
public class CommodityTypeEntity implements Serializable {
    /**
     * @pdOid c9f763bc-c6b9-4c2d-afaf-3078b4972d36
     */
    private String commodityType;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityCommodityType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<CommodityEntity> commodity;

    //<editor-fold desc="constructor">
    public CommodityTypeEntity() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public String getCommodityType() {
        return commodityType;
    }

    public CommodityTypeEntity setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }

    public List<CommodityEntity> getCommodity() {
        return commodity;
    }

    public CommodityTypeEntity setCommodity(List<CommodityEntity> commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommodityTypeEntity that = (CommodityTypeEntity) o;

        return commodityType != null ? commodityType.equals(that.commodityType) : that.commodityType == null;

    }

    @Override
    public int hashCode() {
        return commodityType != null ? commodityType.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CommodityTypeEntity{" +
                "commodityType='" + commodityType + '\'' +
                '}';
    }
    //</editor-fold>


}