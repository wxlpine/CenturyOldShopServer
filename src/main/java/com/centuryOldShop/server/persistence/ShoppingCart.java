package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShoppingCart.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCart
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 6a429811-307d-4c04-95e4-acb6075acaaf
 */
public class ShoppingCart implements Serializable {
    /**
     * @pdOid 4148baff-de2c-4670-84ec-3fb2a7910b4a
     */
    private int amount;
    /**
     * @pdOid 2f41b8c1-e6fc-4b0f-a69c-3d92a57cbcff
     */
    private Date addedTime;

    private AppUser user;
    private Commodity commodity;


    //<editor-fold desc="constructor">

    public ShoppingCart() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public int getAmount() {
        return amount;
    }

    public ShoppingCart setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public ShoppingCart setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public AppUser getUser() {
        return user;
    }

    public ShoppingCart setUser(AppUser user) {
        this.user = user;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public ShoppingCart setCommodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;

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
        return "ShoppingCart{" +
                "amount=" + amount +
                ", addedTime=" + addedTime +
                ", user=" + user +
                ", commodity=" + commodity +
                '}';
    }
    //</editor-fold>

}