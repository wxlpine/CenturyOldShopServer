/***********************************************************************
 * Module:  ShopArea.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

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
    private String shopAreaName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopArea coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Shop> shop;


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopArea() {
    }

    //</editor-fold>

    //<editor-fold name="accessor">

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
    public String getShopAreaName() {
        return shopAreaName;
    }

    /**
     * Set value of shopAreaName
     *
     * @param newShopAreaName
     */
    public void setShopAreaName(String newShopAreaName) {
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

    /**
     * @pdGenerated default getter
     */
    public List<Shop> getShop() {
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
    public void setShop(List<Shop> newShop) {
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

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "ShopArea{" +
                "shopAreaId=" + shopAreaId +
                ", shopAreaName='" + shopAreaName + '\'' +
                '}';
    }


    //</editor-fold>


}