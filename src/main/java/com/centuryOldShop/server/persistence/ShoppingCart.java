/***********************************************************************
 * Module:  ShoppingCart.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

public class ShoppingCart implements java.io.Serializable {

    private ShoppingCartPK id;

    private int amount;

    /**
     * @pdOid 29cedbb2-b84b-4b08-9b85-c7f9c32b955a
     */
    private java.util.Date addedTime;

//    private AppUser shoppingCartUser;
//    private Commodity commodity;


    public ShoppingCartPK getId() {
        return id;
    }

    public ShoppingCart setId(ShoppingCartPK id) {
        this.id = id;
        return this;
    }

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
        return new ShoppingCartPK();
    }

    /**
     * Set value of shoppingCartPK.
     */
    public void setShoppingCartPK(ShoppingCartPK pk) {
        this.id = pk;
    }

//    public AppUser getShoppingCartUser() {
//        return shoppingCartUser;
//    }
//
//    public ShoppingCart setShoppingCartUser(AppUser shoppingCartUser) {
//        this.shoppingCartUser = shoppingCartUser;
//        return this;
//    }
//
//    public Commodity getCommodity() {
//        return commodity;
//    }
//
//    public ShoppingCart setCommodity(Commodity commodity) {
//        this.commodity = commodity;
//        return this;
//    }

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
        ret.append("com.centuryOldShop.server.persistence.ShoppingCart: ")
                .append("amount='")
                .append(amount)
                .append("'")
                .append("addedTime='")
                .append(addedTime)
                .append("'");
        return ret.toString();
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShoppingCart() {

    }

}