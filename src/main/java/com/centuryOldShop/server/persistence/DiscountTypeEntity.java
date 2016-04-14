package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DiscountTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid e05f0e50-7c25-4589-8c85-84b079b0ec3f
 */
public class DiscountTypeEntity implements Serializable {
    /**
     * @pdOid ddc4f80e-5fca-4c58-8331-424d5d947921
     */
    private long discountTypeId;
    /**
     * @pdOid 885361b8-d3a9-4811-b4f9-c866608a66b5
     */
    private String discountTypeName;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=discountInfoDiscountType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfoEntity> discountInfo;

    //<editor-fold desc="constructor">
    public DiscountTypeEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public long getDiscountTypeId() {
        return discountTypeId;
    }

    public DiscountTypeEntity setDiscountTypeId(long discountTypeId) {
        this.discountTypeId = discountTypeId;
        return this;
    }

    public String getDiscountTypeName() {
        return discountTypeName;
    }

    public DiscountTypeEntity setDiscountTypeName(String discountTypeName) {
        this.discountTypeName = discountTypeName;
        return this;
    }

    public List<DiscountInfoEntity> getDiscountInfo() {
        return discountInfo;
    }

    public DiscountTypeEntity setDiscountInfo(List<DiscountInfoEntity> discountInfo) {
        this.discountInfo = discountInfo;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountTypeEntity that = (DiscountTypeEntity) o;

        return discountTypeId == that.discountTypeId;

    }

    @Override
    public int hashCode() {
        return (int) (discountTypeId ^ (discountTypeId >>> 32));
    }

    @Override
    public String toString() {
        return "DiscountTypeEntity{" +
                "discountTypeId=" + discountTypeId +
                ", discountTypeName='" + discountTypeName + '\'' +
                '}';
    }

    //</editor-fold>
}