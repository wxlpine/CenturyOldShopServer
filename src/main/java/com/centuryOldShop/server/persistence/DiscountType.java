/***********************************************************************
 * Module:  DiscountType.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

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
    private java.lang.String discountTypeName;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=discountInfoDiscountType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<DiscountInfo> discountInfo;

    /**
     * Get value of discountTypeId
     *
     * @return discountTypeId
     */
    public long getDiscountTypeId() {
        return discountTypeId;
    }

    /**
     * Set value of discountTypeId
     *
     * @param newDiscountTypeId
     */
    public void setDiscountTypeId(long newDiscountTypeId) {
        this.discountTypeId = newDiscountTypeId;
    }

    /**
     * Get value of discountTypeName
     *
     * @return discountTypeName
     */
    public java.lang.String getDiscountTypeName() {
        return discountTypeName;
    }

    /**
     * Set value of discountTypeName
     *
     * @param newDiscountTypeName
     */
    public void setDiscountTypeName(java.lang.String newDiscountTypeName) {
        this.discountTypeName = newDiscountTypeName;
    }

    /**
     * Get value of discountTypePK.
     *
     * @return discountTypePK object
     */
    public DiscountTypePK getDiscountTypePK() {
        return new DiscountTypePK(discountTypeId);
    }

    /**
     * Set value of discountTypePK.
     *
     * @param pk
     */
    public void setDiscountTypePK(DiscountTypePK pk) {
        if (pk != null) {
            this.discountTypeId = pk.getDiscountTypeId();
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

        if (!(other instanceof DiscountType))
            return false;

        DiscountType cast = (DiscountType) other;

        if (this.discountTypeId != cast.getDiscountTypeId())
            return false;

        if (this.discountTypeName == null ? cast.getDiscountTypeName() != this.discountTypeName : !this.discountTypeName.equals(cast.getDiscountTypeName()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(discountTypeId)).hashCode();
        if (this.discountTypeName != null)
            hashCode = 29 * hashCode + discountTypeName.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DiscountType: ");
        ret.append("discountTypeId='" + discountTypeId + "'");
        ret.append("discountTypeName='" + discountTypeName + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<DiscountInfo> getDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo.iterator();
    }

    /**
     * @param newDiscountInfo
     * @pdGenerated default setter
     */
    public void setDiscountInfo(java.util.List<DiscountInfo> newDiscountInfo) {
        //removeAllDiscountInfo();
        this.discountInfo = newDiscountInfo;
    }

    /**
     * @param newDiscountInfo
     * @pdGenerated default add
     */
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

    /**
     * @param oldDiscountInfo
     * @pdGenerated default remove
     */
    public void removeDiscountInfo(DiscountInfo oldDiscountInfo) {
        if (oldDiscountInfo == null)
            return;
        if (this.discountInfo != null)
            if (this.discountInfo.contains(oldDiscountInfo)) {
                this.discountInfo.remove(oldDiscountInfo);
                oldDiscountInfo.setDiscountType((DiscountType) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public DiscountType() {
    }

}