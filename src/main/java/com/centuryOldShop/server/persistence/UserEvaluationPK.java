/***********************************************************************
 * Module:  UserEvaluationPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Generated primary key class for UserEvaluation. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
@Embeddable
public class UserEvaluationPK implements java.io.Serializable {

    @Column(name = "commodityId")
    private long commodityId;

    @Column(name = "orderFormId")
    private long orderFormId;

    @Column(name = "userId")
    private long userId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public UserEvaluationPK() {

    }

    public UserEvaluationPK(long commodityId, long orderFormId, long userId) {
        this.commodityId = commodityId;
        this.orderFormId = orderFormId;
        this.userId = userId;
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    public long getCommodityId() {
        return commodityId;
    }

    public UserEvaluationPK setCommodityId(long commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    public long getOrderFormId() {
        return orderFormId;
    }

    public UserEvaluationPK setOrderFormId(long orderFormId) {
        this.orderFormId = orderFormId;
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public UserEvaluationPK setUserId(long userId) {
        this.userId = userId;
        return this;
    }


    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEvaluationPK that = (UserEvaluationPK) o;

        if (getCommodityId() != that.getCommodityId()) return false;
        if (getOrderFormId() != that.getOrderFormId()) return false;
        return getUserId() == that.getUserId();

    }

    @Override
    public int hashCode() {
        int result = (int) (getCommodityId() ^ (getCommodityId() >>> 32));
        result = 31 * result + (int) (getOrderFormId() ^ (getOrderFormId() >>> 32));
        result = 31 * result + (int) (getUserId() ^ (getUserId() >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "UserEvaluationPK{" +
                "commodityId=" + commodityId +
                ", orderFormId=" + orderFormId +
                ", userId=" + userId +
                '}';
    }

    //</editor-fold>
}