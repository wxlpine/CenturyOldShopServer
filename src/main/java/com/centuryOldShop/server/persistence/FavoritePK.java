/***********************************************************************
 * Module:  FavoritePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Generated primary key class for Favorite. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
@Embeddable
public class FavoritePK implements java.io.Serializable {

    @Column(name="userId")
    private long userId;

    @Column(name="commodityId")
    private long commodityId;

    /**
     * Empty constructor
     */
    public FavoritePK() {
    }

    public FavoritePK(long userId, long commodityId) {
        this.userId = userId;
        this.commodityId = commodityId;
    }

    public long getUserId() {
        return userId;
    }

    public FavoritePK setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public long getCommodityId() {
        return commodityId;
    }

    public FavoritePK setCommodityId(long commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoritePK that = (FavoritePK) o;

        if (userId != that.userId) return false;
        return commodityId == that.commodityId;

    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (commodityId ^ (commodityId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "FavoritePK{" +
                "userId=" + userId +
                ", commodityId=" + commodityId +
                '}';
    }
}