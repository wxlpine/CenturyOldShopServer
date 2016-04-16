/***********************************************************************
 * Module:  ShoppingCart.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 2d4b654e-6236-4b05-bb7c-cdb4475ebb62
 */
public class ShoppingCart implements java.io.Serializable {
    /**
     * @pdOid 7d059eef-1dab-4da7-a1c3-1b51585cd62a
     */
    private int amount;
    /**
     * @pdOid 29cedbb2-b84b-4b08-9b85-c7f9c32b955a
     */
    private java.util.Date addedTime;

    private AppUser shoppingCartUser;
    private Commodity commodity;

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
     *
     * @param newAmount
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
     *
     * @param newAddedTime
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
        return new ShoppingCartPK();
    }

    /**
     * Set value of shoppingCartPK.
     *
     * @param pk
     */
    public void setShoppingCartPK(ShoppingCartPK pk) {
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof ShoppingCart))
            return false;

        ShoppingCart cast = (ShoppingCart) other;

        if (this.amount != cast.getAmount())
            return false;

        if (this.addedTime == null ? cast.getAddedTime() != this.addedTime : !(com.sybase.orm.util.Util.compareDate(this.addedTime, cast.getAddedTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Integer(amount)).hashCode();
        if (this.addedTime != null)
            hashCode = 29 * hashCode + addedTime.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShoppingCart: ");
        ret.append("amount='" + amount + "'");
        ret.append("addedTime='" + addedTime + "'");
        return ret.toString();
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShoppingCart() {

    }

}