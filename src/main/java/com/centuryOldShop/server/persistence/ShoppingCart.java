/***********************************************************************
 * Module:  ShoppingCart.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

public class ShoppingCart implements java.io.Serializable {

    private ShoppingCartPK shoppingCartPK;

    private int amount;

    /**
     * @pdOid 29cedbb2-b84b-4b08-9b85-c7f9c32b955a
     */
    private java.util.Date addedTime;

    private AppUser shoppingCartUser;
    private Commodity commodity;

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShoppingCart() {

    }

    //<editor-fold name="accessor">

    /**
     * Get value of amount
     *
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set value of amount
     */
    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    /**
     * Get value of addedTime
     *
     * @return addedTime
     */
    public java.util.Date getAddedTime() {
        return addedTime;
    }

    /**
     * Set value of addedTime
     */
    public void setAddedTime(java.util.Date newAddedTime) {
        this.addedTime = newAddedTime;
    }

    /**
     * Get value of shoppingCartPK.
     *
     * @return shoppingCartPK object
     */
    public ShoppingCartPK getShoppingCartPK() {
        return shoppingCartPK;
    }

    /**
     * Set value of shoppingCartPK.
     */
    public void setShoppingCartPK(ShoppingCartPK pk) {
        this.shoppingCartPK = pk;
    }

    public AppUser getShoppingCartUser() {
        return shoppingCartUser;
    }

    public ShoppingCart setShoppingCartUser(AppUser shoppingCartUser) {
        this.shoppingCartUser = shoppingCartUser;
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
        if (!(o instanceof ShoppingCart)) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (amount != that.amount) return false;
        if (shoppingCartPK != null ? !shoppingCartPK.equals(that.shoppingCartPK) : that.shoppingCartPK != null)
            return false;
        return addedTime != null ? addedTime.equals(that.addedTime) : that.addedTime == null;

    }

    @Override
    public int hashCode() {
        int result = shoppingCartPK != null ? shoppingCartPK.hashCode() : 0;
        result = 31 * result + amount;
        result = 31 * result + (addedTime != null ? addedTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCartPK=" + shoppingCartPK +
                ", amount=" + amount +
                ", addedTime=" + addedTime +
                ", shoppingCartUser=" + shoppingCartUser +
                ", commodity=" + commodity +
                '}';
    }

    //</editor-fold>

}