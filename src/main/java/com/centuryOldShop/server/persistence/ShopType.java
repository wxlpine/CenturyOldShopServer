/***********************************************************************
 * Module:  ShopType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid 9abdc174-f1e9-4e08-9841-6e335c0c3070
 */
public class ShopType implements java.io.Serializable {
    /**
     * @pdOid c9a9711d-7338-40fa-be2f-b29ed6e7b5cb
     */
    private String shopTypeName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Shop> shop;


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopType() {
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    /**
     * Get value of shopTypeName
     *
     * @return shopTypeName
     */
    public String getShopTypeName() {
        return shopTypeName;
    }

    /**
     * Set value of shopTypeName
     *
     * @param newShopTypeName
     */
    public void setShopTypeName(String newShopTypeName) {
        this.shopTypeName = newShopTypeName;
    }

    /**
     * Get value of shopTypePK.
     *
     * @return shopTypePK object
     */
    public ShopTypePK getShopTypePK() {
        return new ShopTypePK(shopTypeName);
    }

    /**
     * Set value of shopTypePK.
     *
     * @param pk
     */
    public void setShopTypePK(ShopTypePK pk) {
        if (pk != null) {
            this.shopTypeName = pk.getShopTypeName();
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
            newShop.setShopType(this);
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
                oldShop.setShopType((ShopType) null);
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
                oldShop.setShopType((ShopType) null);
            }
        }
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "ShopType{" +
                "shopTypeName='" + shopTypeName + '\'' +
                '}';
    }


    //</editor-fold>



}