/***********************************************************************
 * Module:  SpecialCraft.java
 * Author:  cmicat
 * Purpose: Defines the Class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid a54c6878-0a33-4957-9496-7f2d48194ce3
 */
public class SpecialCraft implements java.io.Serializable {
    /**
     * @pdOid c4d4b323-fc18-4ce6-b6b1-8675d95fcb47
     */
    private long specialCraftId;
    /**
     * @pdOid 9f11c167-c503-4d3d-bebf-e5c2ce14b2ff
     */
    private String title;
    /**
     * @pdOid b405206e-9733-47f9-9237-af377d160ede
     */
    private String smallPhotoUrl;
    /**
     * @pdOid f76452fa-d151-4a32-b118-1e963a4f6bf9
     */
    private String introductionUrl;
    /**
     * @pdOid 1a774143-b202-4e4a-a663-2e1d2ffa5e8f
     */
    private java.util.Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=specialCraftShop mult=1..1 side=A
     */
    private Shop shop;

    /**
     * @pdOid 193039b5-f38f-432c-b5f9-fda6984b8b72
     */
    public String shortIntro;


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public SpecialCraft() {

    }

    //</editor-fold>

    //<editor-fold name="accessor">

    /**
     * Get value of specialCraftId
     *
     * @return specialCraftId
     */
    public long getSpecialCraftId() {
        return specialCraftId;
    }

    /**
     * Set value of specialCraftId
     *
     * @param newSpecialCraftId
     */
    public void setSpecialCraftId(long newSpecialCraftId) {
        this.specialCraftId = newSpecialCraftId;
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
     * Get value of introductionUrl
     *
     * @return introductionUrl
     */
    public String getIntroductionUrl() {
        return introductionUrl;
    }

    /**
     * Set value of introductionUrl
     *
     * @param newIntroductionUrl
     */
    public void setIntroductionUrl(String newIntroductionUrl) {
        this.introductionUrl = newIntroductionUrl;
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
     * Get value of shortIntro
     *
     * @return shortIntro
     */
    public String getShortIntro() {
        return shortIntro;
    }

    /**
     * Set value of shortIntro
     *
     * @param newShortIntro
     */
    public void setShortIntro(String newShortIntro) {
        this.shortIntro = newShortIntro;
    }

    /**
     * Get value of specialCraftPK.
     *
     * @return specialCraftPK object
     */
    public SpecialCraftPK getSpecialCraftPK() {
        return new SpecialCraftPK(specialCraftId);
    }

    /**
     * Set value of specialCraftPK.
     *
     * @param pk
     */
    public void setSpecialCraftPK(SpecialCraftPK pk) {
        if (pk != null) {
            this.specialCraftId = pk.getSpecialCraftId();
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
                //oldShop.removeSpecialCraft(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addSpecialCraft(this);
            }
        }
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "SpecialCraft{" +
                "specialCraftId=" + specialCraftId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", introductionUrl='" + introductionUrl + '\'' +
                ", addedTime=" + addedTime +
                ", shop=" + shop +
                ", shortIntro='" + shortIntro + '\'' +
                '}';
    }


    //</editor-fold>

}