package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShoppingCartEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCartEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 6a429811-307d-4c04-95e4-acb6075acaaf
 */
public class ShoppingCartEntity implements Serializable {
    /**
     * @pdOid 4148baff-de2c-4670-84ec-3fb2a7910b4a
     */
    private int amount;
    /**
     * @pdOid 2f41b8c1-e6fc-4b0f-a69c-3d92a57cbcff
     */
    private Date addedTime;

    private AppUserEntity user;
    private CommodityEntity commodity;


    //<editor-fold desc="constructor">

    public ShoppingCartEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public int getAmount() {
        return amount;
    }

    public ShoppingCartEntity setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public ShoppingCartEntity setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public AppUserEntity getUser() {
        return user;
    }

    public ShoppingCartEntity setUser(AppUserEntity user) {
        this.user = user;
        return this;
    }

    public CommodityEntity getCommodity() {
        return commodity;
    }

    public ShoppingCartEntity setCommodity(CommodityEntity commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCartEntity that = (ShoppingCartEntity) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return commodity != null ? commodity.equals(that.commodity) : that.commodity == null;

    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (commodity != null ? commodity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingCartEntity{" +
                "amount=" + amount +
                ", addedTime=" + addedTime +
                ", user=" + user +
                ", commodity=" + commodity +
                '}';
    }
    //</editor-fold>

}