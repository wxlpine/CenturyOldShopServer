package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  SpecialCraft.java
 * Author:  cmicat
 * Purpose: Defines the Class SpecialCraft
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 219a3ee8-f77a-4798-b702-3b3c24114fae
 */
public class SpecialCraft implements Serializable {
    /**
     * @pdOid 2d9ac220-7ce8-4374-b747-b7555ff5b6b8
     */
    private long specialCraftId;
    /**
     * @pdOid 44698309-72b0-4a13-bd64-9b8e3e878217
     */
    private String title;
    /**
     * @pdOid 53bc5d2b-3d98-4be8-9217-863e95c4f9e9
     */
    private String smallPhotoUrl;
    /**
     * @pdOid fe5b048e-ce1e-40db-95c2-6726d74fb55e
     */
    private String introductionUrl;
    /**
     * @pdOid 71862d6f-e663-419b-8be7-9c4891b8ef21
     */
    private Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=specialCraftShop mult=1..1 side=A
     */
    private Shop shop;


    //<editor-fold desc="constructor">

    public SpecialCraft() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getSpecialCraftId() {
        return specialCraftId;
    }

    public SpecialCraft setSpecialCraftId(long specialCraftId) {
        this.specialCraftId = specialCraftId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SpecialCraft setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public SpecialCraft setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getIntroductionUrl() {
        return introductionUrl;
    }

    public SpecialCraft setIntroductionUrl(String introductionUrl) {
        this.introductionUrl = introductionUrl;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public SpecialCraft setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public SpecialCraft setShop(Shop shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialCraft that = (SpecialCraft) o;

        return specialCraftId == that.specialCraftId;

    }

    @Override
    public int hashCode() {
        return (int) (specialCraftId ^ (specialCraftId >>> 32));
    }

    @Override
    public String toString() {
        return "SpecialCraft{" +
                "specialCraftId=" + specialCraftId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", introductionUrl='" + introductionUrl + '\'' +
                ", addedTime=" + addedTime +
                ", shop=" + shop +
                '}';
    }

    //</editor-fold>

}