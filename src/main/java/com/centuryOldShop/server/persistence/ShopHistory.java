/***********************************************************************
 * Module:  ShopHistory.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 1d20cb6a-faf2-4a6f-a403-ce554f02c20b
 */
public class ShopHistory implements java.io.Serializable {
    /**
     * @pdOid c054dd98-6629-4f2d-a8a6-94ecfca57ec9
     */
    private long shopHistoryId;
    /**
     * @pdOid dae5af7d-13c1-4be7-b304-48e9e87b5216
     */
    private String title;
    /**
     * @pdOid e2e715e5-cb59-4bad-b0a6-65f17fb5a3e6
     */
    private String smallPhotoUrl;
    /**
     * @pdOid aa4d6db2-7eab-4342-aa3e-27fb0e4bcbfe
     */
    private String shortDescription;
    /**
     * @pdOid b57160a5-7392-4301-822f-119dea9727e3
     */
    private java.util.Date publishTime;
    /**
     * @pdOid c0870f27-f172-4655-bdc5-4ba57f452355
     */
    private int visitCount;
    /**
     * @pdOid 04e6ab91-6e15-49a2-a87b-99ff6aaed7f9
     */
    private String detailedIntroductionPageUrl;


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopHistory() {
    }

    //</editor-fold>

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopHistory mult=1..1 side=A
     */
    private Shop shop;

    //<editor-fold name="accessor">

    /**
     * Get value of shopHistoryId
     *
     * @return shopHistoryId
     */
    public long getShopHistoryId() {
        return shopHistoryId;
    }

    /**
     * Set value of shopHistoryId
     *
     * @param newShopHistoryId
     */
    public void setShopHistoryId(long newShopHistoryId) {
        this.shopHistoryId = newShopHistoryId;
    }

    /**
     * Get value of title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set value of title
     *
     * @param newTitle
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get value of smallPhotoUrl
     *
     * @return smallPhotoUrl
     */
    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    /**
     * Set value of smallPhotoUrl
     *
     * @param newSmallPhotoUrl
     */
    public void setSmallPhotoUrl(String newSmallPhotoUrl) {
        this.smallPhotoUrl = newSmallPhotoUrl;
    }

    /**
     * Get value of shortDescription
     *
     * @return shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Set value of shortDescription
     *
     * @param newShortDescription
     */
    public void setShortDescription(String newShortDescription) {
        this.shortDescription = newShortDescription;
    }

    /**
     * Get value of publishTime
     *
     * @return publishTime
     */
    public java.util.Date getPublishTime() {
        return publishTime;
    }

    /**
     * Set value of publishTime
     *
     * @param newPublishTime
     */
    public void setPublishTime(java.util.Date newPublishTime) {
        this.publishTime = newPublishTime;
    }

    /**
     * Get value of visitCount
     *
     * @return visitCount
     */
    public int getVisitCount() {
        return visitCount;
    }

    /**
     * Set value of visitCount
     *
     * @param newVisitCount
     */
    public void setVisitCount(int newVisitCount) {
        this.visitCount = newVisitCount;
    }

    /**
     * Get value of detailedIntroductionPageUrl
     *
     * @return detailedIntroductionPageUrl
     */
    public String getDetailedIntroductionPageUrl() {
        return detailedIntroductionPageUrl;
    }

    /**
     * Set value of detailedIntroductionPageUrl
     *
     * @param newDetailedIntroductionPageUrl
     */
    public void setDetailedIntroductionPageUrl(String newDetailedIntroductionPageUrl) {
        this.detailedIntroductionPageUrl = newDetailedIntroductionPageUrl;
    }

    /**
     * Get value of shopHistoryPK.
     *
     * @return shopHistoryPK object
     */
    public ShopHistoryPK getShopHistoryPK() {
        return new ShopHistoryPK(shopHistoryId);
    }

    /**
     * Set value of shopHistoryPK.
     *
     * @param pk
     */
    public void setShopHistoryPK(ShopHistoryPK pk) {
        if (pk != null) {
            this.shopHistoryId = pk.getShopHistoryId();
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param newShop
     * @pdGenerated default parent setter
     */
    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
                //oldShop.removeShopHistory(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addShopHistory(this);
            }
        }
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "ShopHistory{" +
                "shopHistoryId=" + shopHistoryId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", publishTime=" + publishTime +
                ", visitCount=" + visitCount +
                ", detailedIntroductionPageUrl='" + detailedIntroductionPageUrl + '\'' +
                ", shop=" + shop +
                '}';
    }


    //</editor-fold>


}