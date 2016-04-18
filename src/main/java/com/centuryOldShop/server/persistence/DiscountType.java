/***********************************************************************
 * Module:  DiscountType.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid 0acedbd1-f1cf-477e-93c5-65e2c4ecf157
 */
public class DiscountType implements java.io.Serializable {
    /**
     * @pdOid 166e175c-fe65-45eb-9e79-e3b98b98da6b
     */
    private long discountTypeId;
    /**
     * @pdOid 306f7746-0db1-486b-8b2a-3ee9aa246a7e
     */
    private String discountTypeName;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=discountInfoDiscountType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfo> discountInfo;


    /**
     * Empty constructor which is required by Hibernate
     */
    public DiscountType() {
    }

    //<editor-fold name="accessor">

    public long getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(long newDiscountTypeId) {
        this.discountTypeId = newDiscountTypeId;
    }

    public String getDiscountTypeName() {
        return discountTypeName;
    }

    public void setDiscountTypeName(String newDiscountTypeName) {
        this.discountTypeName = newDiscountTypeName;
    }

    public DiscountTypePK getDiscountTypePK() {
        return new DiscountTypePK(discountTypeId);
    }

    public void setDiscountTypePK(DiscountTypePK pk) {
        if (pk != null) {
            this.discountTypeId = pk.getDiscountTypeId();
        }
    }

    public List<DiscountInfo> getDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo;
    }

    public java.util.Iterator getIteratorDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo.iterator();
    }

    public void setDiscountInfo(List<DiscountInfo> newDiscountInfo) {
        //removeAllDiscountInfo();
        this.discountInfo = newDiscountInfo;
    }

    public void addDiscountInfo(DiscountInfo newDiscountInfo) {
        if (newDiscountInfo == null)
            return;
        if (this.discountInfo == null)
            this.discountInfo = new java.util.ArrayList<DiscountInfo>();
        if (!this.discountInfo.contains(newDiscountInfo)) {
            this.discountInfo.add(newDiscountInfo);
            newDiscountInfo.setDiscountType(this);
        }
    }

    public void removeDiscountInfo(DiscountInfo oldDiscountInfo) {
        if (oldDiscountInfo == null)
            return;
        if (this.discountInfo != null)
            if (this.discountInfo.contains(oldDiscountInfo)) {
                this.discountInfo.remove(oldDiscountInfo);
                oldDiscountInfo.setDiscountType((DiscountType) null);
            }
    }

    public void removeAllDiscountInfo() {
        if (discountInfo != null) {
            DiscountInfo oldDiscountInfo;
            for (java.util.Iterator iter = getIteratorDiscountInfo(); iter.hasNext(); ) {
                oldDiscountInfo = (DiscountInfo) iter.next();
                iter.remove();
                oldDiscountInfo.setDiscountType((DiscountType) null);
            }
        }
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "DiscountType{" +
                "discountTypeId=" + discountTypeId +
                ", discountTypeName='" + discountTypeName + '\'' +
                '}';
    }

    //</editor-fold>


}