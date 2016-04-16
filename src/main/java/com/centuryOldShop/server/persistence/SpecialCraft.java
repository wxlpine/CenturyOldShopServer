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
    private java.lang.String title;
    /**
     * @pdOid b405206e-9733-47f9-9237-af377d160ede
     */
    private java.lang.String smallPhotoUrl;
    /**
     * @pdOid f76452fa-d151-4a32-b118-1e963a4f6bf9
     */
    private java.lang.String introductionUrl;
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
    public java.lang.String shortIntro;

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
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Set value of title
     *
     * @param newTitle
     */
    public void setTitle(java.lang.String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get value of smallPhotoUrl
     *
     * @return smallPhotoUrl
     */
    public java.lang.String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    /**
     * Set value of smallPhotoUrl
     *
     * @param newSmallPhotoUrl
     */
    public void setSmallPhotoUrl(java.lang.String newSmallPhotoUrl) {
        this.smallPhotoUrl = newSmallPhotoUrl;
    }

    /**
     * Get value of introductionUrl
     *
     * @return introductionUrl
     */
    public java.lang.String getIntroductionUrl() {
        return introductionUrl;
    }

    /**
     * Set value of introductionUrl
     *
     * @param newIntroductionUrl
     */
    public void setIntroductionUrl(java.lang.String newIntroductionUrl) {
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
    public java.lang.String getShortIntro() {
        return shortIntro;
    }

    /**
     * Set value of shortIntro
     *
     * @param newShortIntro
     */
    public void setShortIntro(java.lang.String newShortIntro) {
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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof SpecialCraft))
            return false;

        SpecialCraft cast = (SpecialCraft) other;

        if (this.specialCraftId != cast.getSpecialCraftId())
            return false;

        if (this.title == null ? cast.getTitle() != this.title : !this.title.equals(cast.getTitle()))
            return false;

        if (this.smallPhotoUrl == null ? cast.getSmallPhotoUrl() != this.smallPhotoUrl : !this.smallPhotoUrl.equals(cast.getSmallPhotoUrl()))
            return false;

        if (this.introductionUrl == null ? cast.getIntroductionUrl() != this.introductionUrl : !this.introductionUrl.equals(cast.getIntroductionUrl()))
            return false;

        if (this.addedTime == null ? cast.getAddedTime() != this.addedTime : !(com.sybase.orm.util.Util.compareDate(this.addedTime, cast.getAddedTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.shortIntro == null ? cast.getShortIntro() != this.shortIntro : !this.shortIntro.equals(cast.getShortIntro()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(specialCraftId)).hashCode();
        if (this.title != null)
            hashCode = 29 * hashCode + title.hashCode();
        if (this.smallPhotoUrl != null)
            hashCode = 29 * hashCode + smallPhotoUrl.hashCode();
        if (this.introductionUrl != null)
            hashCode = 29 * hashCode + introductionUrl.hashCode();
        if (this.addedTime != null)
            hashCode = 29 * hashCode + addedTime.hashCode();
        if (this.shortIntro != null)
            hashCode = 29 * hashCode + shortIntro.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.SpecialCraft: ");
        ret.append("specialCraftId='" + specialCraftId + "'");
        ret.append("title='" + title + "'");
        ret.append("smallPhotoUrl='" + smallPhotoUrl + "'");
        ret.append("introductionUrl='" + introductionUrl + "'");
        ret.append("addedTime='" + addedTime + "'");
        ret.append("shortIntro='" + shortIntro + "'");
        return ret.toString();
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public SpecialCraft() {

    }

}