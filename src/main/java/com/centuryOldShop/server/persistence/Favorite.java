/***********************************************************************
 * Module:  Favorite.java
 * Author:  cmicat
 * Purpose: Defines the Class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid fd7231df-0466-4d8b-b0c7-c500e6dc55a9
 */
public class Favorite implements java.io.Serializable {

    private FavoritePK favoritePK;

    /**
     * @pdOid 98df48f9-793e-454b-bd8c-e62c8a0e4eb4
     */
    private java.util.Date addTime;

    private Commodity favoriteCommodity;
    private AppUser favoriteUser;


    /**
     * Empty constructor which is required by Hibernate
     */
    public Favorite() {
    }


    //<editor-fold name="accessor">

    public FavoritePK getFavoritePK() {
        return favoritePK;
    }

    public Favorite setFavoritePK(FavoritePK id) {
        this.favoritePK = id;
        return this;
    }

    public Commodity getFavoriteCommodity() {
        return favoriteCommodity;
    }

    public Favorite setFavoriteCommodity(Commodity favoriteCommodity) {
        this.favoriteCommodity = favoriteCommodity;
        return this;
    }

    public AppUser getFavoriteUser() {
        return favoriteUser;
    }

    public Favorite setFavoriteUser(AppUser favoriteUser) {
        this.favoriteUser = favoriteUser;
        return this;
    }

    public java.util.Date getAddTime() {
        return addTime;
    }

    public void setAddTime(java.util.Date newAddTime) {
        this.addTime = newAddTime;
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Favorite)) return false;

        Favorite favorite = (Favorite) o;

        if (favoritePK != null ? !favoritePK.equals(favorite.favoritePK) : favorite.favoritePK != null) return false;
        return addTime != null ? addTime.equals(favorite.addTime) : favorite.addTime == null;

    }

    @Override
    public int hashCode() {
        int result = favoritePK != null ? favoritePK.hashCode() : 0;
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "favoritePK=" + favoritePK +
                ", addTime=" + addTime +
                ", favoriteCommodity=" + favoriteCommodity +
                ", favoriteUser=" + favoriteUser +
                '}';
    }

    //</editor-fold>


}