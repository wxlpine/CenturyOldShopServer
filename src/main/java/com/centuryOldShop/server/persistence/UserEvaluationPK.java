/***********************************************************************
 * Module:  UserEvaluationPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

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

    //<editor-fold name="constructor">

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

    //</editor-fold>


    //<editor-fold name="accessor">


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

    //</editor-fold>


    //<editor-fold name="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEvaluationPK that = (UserEvaluationPK) o;
        return Objects.equals(commodity, that.commodity) &&
                Objects.equals(orderForm, that.orderForm) &&
                Objects.equals(appUser, that.appUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodity, orderForm, appUser);
    }

    @Override
    public String toString() {
        return "UserEvaluationPK{" +
                "commodity=" + commodity +
                ", orderForm=" + orderForm +
                ", appUser=" + appUser +
                '}';
    }

    //</editor-fold>
}