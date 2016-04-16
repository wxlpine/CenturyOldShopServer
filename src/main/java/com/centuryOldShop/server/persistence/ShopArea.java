/***********************************************************************
 * Module:  ShopArea.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 841b88ce-2fbe-45ca-99c0-3121449b37bb
 */
public class ShopArea implements java.io.Serializable {
    /**
     * @pdOid e1b625ba-97a1-4473-a7e6-d692abfa826d
     */
    private long shopAreaId;
    /**
     * @pdOid fe867869-bde9-4ddc-a05d-3256a3cecd55
     */
    private java.lang.String shopAreaName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopArea coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<Shop> shop;

    /**
     * Get value of shopAreaId
     *
     * @return shopAreaId
     */
    public long getShopAreaId() {
        return shopAreaId;
    }

    /**
     * Set value of shopAreaId
     *
     * @param newShopAreaId
     */
    public void setShopAreaId(long newShopAreaId) {
        this.shopAreaId = newShopAreaId;
    }

    /**
     * Get value of shopAreaName
     *
     * @return shopAreaName
     */
    public java.lang.String getShopAreaName() {
        return shopAreaName;
    }

    /**
     * Set value of shopAreaName
     *
     * @param newShopAreaName
     */
    public void setShopAreaName(java.lang.String newShopAreaName) {
        this.shopAreaName = newShopAreaName;
    }

    /**
     * Get value of shopAreaPK.
     *
     * @return shopAreaPK object
     */
    public ShopAreaPK getShopAreaPK() {
        return new ShopAreaPK(shopAreaId);
    }

    /**
     * Set value of shopAreaPK.
     *
     * @param pk
     */
    public void setShopAreaPK(ShopAreaPK pk) {
        if (pk != null) {
            this.shopAreaId = pk.getShopAreaId();
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

        if (!(other instanceof ShopArea))
            return false;

        ShopArea cast = (ShopArea) other;

        if (this.shopAreaId != cast.getShopAreaId())
            return false;

        if (this.shopAreaName == null ? cast.getShopAreaName() != this.shopAreaName : !this.shopAreaName.equals(cast.getShopAreaName()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(shopAreaId)).hashCode();
        if (this.shopAreaName != null)
            hashCode = 29 * hashCode + shopAreaName.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopArea: ");
        ret.append("shopAreaId='" + shopAreaId + "'");
        ret.append("shopAreaName='" + shopAreaName + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<Shop> getShop() {
        if (shop == null)
            shop = new java.util.ArrayList<Shop>();
        return shop;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShop() {
        if (shop == null)
            shop = new java.util.ArrayList<Shop>();
        return shop.iterator();
    }

    /**
     * @param newShop
     * @pdGenerated default setter
     */
    public void setShop(java.util.List<Shop> newShop) {
        //removeAllShop();
        this.shop = newShop;
    }

    /**
     * @param newShop
     * @pdGenerated default add
     */
    public void addShop(Shop newShop) {
        if (newShop == null)
            return;
        if (this.shop == null)
            this.shop = new java.util.ArrayList<Shop>();
        if (!this.shop.contains(newShop)) {
            this.shop.add(newShop);
            newShop.setShopArea(this);
        }
    }

    /**
     * @param oldShop
     * @pdGenerated default remove
     */
    public void removeShop(Shop oldShop) {
        if (oldShop == null)
            return;
        if (this.shop != null)
            if (this.shop.contains(oldShop)) {
                this.shop.remove(oldShop);
                oldShop.setShopArea((ShopArea) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllShop() {
        if (shop != null) {
            Shop oldShop;
            for (java.util.Iterator iter = getIteratorShop(); iter.hasNext(); ) {
                oldShop = (Shop) iter.next();
                iter.remove();
                oldShop.setShopArea((ShopArea) null);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopArea() {
    }

}