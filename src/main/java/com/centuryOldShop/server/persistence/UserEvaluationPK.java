/***********************************************************************
 * Module:  UserEvaluationPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for UserEvaluation. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class UserEvaluationPK implements java.io.Serializable {
    /**
     * @pdRoleInfo migr=no name=Commodity assc=userEvaluation mult=1..1 side=A
     */
    private Commodity commodity;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=userEvaluation mult=1..1 side=A
     */
    private OrderForm orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userEvaluation mult=1..1 side=A
     */
    private AppUser appUser;

    /**
     * Empty constructor
     */
    public UserEvaluationPK() {

    }

    /**
     * Constructor with parameters
     * * @param commodity parameter to set value of field userEvaluation
     *
     * @param orderForm parameter to set value of field userEvaluation
     * @param appUser   parameter to set value of field userEvaluation
     */
    public UserEvaluationPK(Commodity commodity, OrderForm orderForm, AppUser appUser) {
        this.commodity = commodity;
        this.orderForm = orderForm;
        this.appUser = appUser;
    }


    /**
     * Get value of property commodity.
     *
     * @return value of property commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * Set value of property commodity.
     *
     * @param commodity
     */
    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    /**
     * Get value of property orderForm.
     *
     * @return value of property orderForm
     */
    public OrderForm getOrderForm() {
        return this.orderForm;
    }

    /**
     * Set value of property orderForm.
     *
     * @param orderForm
     */
    public void setOrderForm(OrderForm orderForm) {
        this.orderForm = orderForm;
    }

    /**
     * Get value of property appUser.
     *
     * @return value of property appUser
     */
    public AppUser getAppUser() {
        return this.appUser;
    }

    /**
     * Set value of property appUser.
     *
     * @param appUser
     */
    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        UserEvaluationPK cast = (UserEvaluationPK) other;

        if (this.commodity == null ? cast.getCommodity() != this.commodity : !this.commodity.equals(cast.getCommodity()))
            return false;

        if (this.orderForm == null ? cast.getOrderForm() != this.orderForm : !this.orderForm.equals(cast.getOrderForm()))
            return false;

        if (this.appUser == null ? cast.getAppUser() != this.appUser : !this.appUser.equals(cast.getAppUser()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.commodity != null)
            _hashCode = 29 * _hashCode + commodity.hashCode();
        if (this.orderForm != null)
            _hashCode = 29 * _hashCode + orderForm.hashCode();
        if (this.appUser != null)
            _hashCode = 29 * _hashCode + appUser.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.UserEvaluationPK: ");
        ret.append("commodity='" + commodity + "'");
        ret.append("orderForm='" + orderForm + "'");
        ret.append("appUser='" + appUser + "'");
        return ret.toString();
    }
}