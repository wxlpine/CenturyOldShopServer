package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  UserEvaluationEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class UserEvaluationEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 173aa411-6a07-49b5-9b29-68b8b60c2468
 */
public class UserEvaluationEntity implements Serializable {
    /**
     * @pdOid bf274b33-04f8-4d16-a953-db82c2f36fa0
     */
    private double grade;
    /**
     * @pdOid 54127b30-5c4e-474b-b102-cdff2654d932
     */
    private String comment;
    /**
     * @pdOid 9cf05bf0-7565-40a4-a845-e71931a10151
     */
    private Date time;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=userEvaluation mult=1..1 side=A
     */
    private CommodityEntity commodity;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=userEvaluation mult=1..1 side=A
     */
    private OrderFormEntity orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userEvaluation mult=1..1 side=A
     */
    private AppUserEntity appUser;

    //<editor-fold desc="constructor">

    public UserEvaluationEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public double getGrade() {
        return grade;
    }

    public UserEvaluationEntity setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserEvaluationEntity setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public UserEvaluationEntity setTime(Date time) {
        this.time = time;
        return this;
    }

    public CommodityEntity getCommodity() {
        return commodity;
    }

    public UserEvaluationEntity setCommodity(CommodityEntity commodity) {
        this.commodity = commodity;
        return this;
    }

    public OrderFormEntity getOrderForm() {
        return orderForm;
    }

    public UserEvaluationEntity setOrderForm(OrderFormEntity orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public AppUserEntity getAppUser() {
        return appUser;
    }

    public UserEvaluationEntity setAppUser(AppUserEntity appUser) {
        this.appUser = appUser;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEvaluationEntity that = (UserEvaluationEntity) o;

        if (commodity != null ? !commodity.equals(that.commodity) : that.commodity != null) return false;
        if (orderForm != null ? !orderForm.equals(that.orderForm) : that.orderForm != null) return false;
        return appUser != null ? appUser.equals(that.appUser) : that.appUser == null;

    }

    @Override
    public int hashCode() {
        int result = commodity != null ? commodity.hashCode() : 0;
        result = 31 * result + (orderForm != null ? orderForm.hashCode() : 0);
        result = 31 * result + (appUser != null ? appUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserEvaluationEntity{" +
                "grade=" + grade +
                ", comment='" + comment + '\'' +
                ", time=" + time +
                ", commodity=" + commodity +
                ", orderForm=" + orderForm +
                ", appUser=" + appUser +
                '}';
    }

    //</editor-fold>

}