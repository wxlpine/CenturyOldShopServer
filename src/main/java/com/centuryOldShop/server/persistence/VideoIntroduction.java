/***********************************************************************
 * Module:  VideoIntroduction.java
 * Author:  cmicat
 * Purpose: Defines the Class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 164f8051-9b70-45ec-bf60-09ee253ddee3
 */
public class VideoIntroduction implements java.io.Serializable {
    /**
     * @pdOid c1e5a7cf-51ae-4665-873d-607dd4617248
     */
    private long videoIntroductionId;
    /**
     * @pdOid 827d5790-f91c-4a18-84a8-73d3c3febf89
     */
    private java.lang.String videoUrl;
    /**
     * @pdOid 1a526bd1-c829-41f3-a5ca-8f9bdb429200
     */
    private int duration;
    /**
     * @pdOid 49b3e420-089c-4fb5-a748-71f283c93b45
     */
    private java.lang.String screenshotUrl;
    /**
     * @pdOid eb60da42-8a1a-4dee-8503-48b934c99093
     */
    private int playedTimes;
    /**
     * @pdOid e58b044c-6730-4010-8dfe-ce1e85bb0b53
     */
    private double rate;
    /**
     * @pdOid a66b8422-d918-4de3-91f4-173dda290620
     */
    private java.util.Date addedTime;

    /**
     * @pdRoleInfo migr=no name=RateKeyword assc=videoIntroductionKeyword coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<RateKeyword> rateKeyword;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopVideoIntroduction mult=1..1 side=A
     */
    private Shop shop;

    /**
     * Get value of videoIntroductionId
     *
     * @return videoIntroductionId
     */
    public long getVideoIntroductionId() {
        return videoIntroductionId;
    }

    /**
     * Set value of videoIntroductionId
     *
     * @param newVideoIntroductionId
     */
    public void setVideoIntroductionId(long newVideoIntroductionId) {
        this.videoIntroductionId = newVideoIntroductionId;
    }

    /**
     * Get value of videoUrl
     *
     * @return videoUrl
     */
    public java.lang.String getVideoUrl() {
        return videoUrl;
    }

    /**
     * Set value of videoUrl
     *
     * @param newVideoUrl
     */
    public void setVideoUrl(java.lang.String newVideoUrl) {
        this.videoUrl = newVideoUrl;
    }

    /**
     * Get value of duration
     *
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set value of duration
     *
     * @param newDuration
     */
    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }

    /**
     * Get value of screenshotUrl
     *
     * @return screenshotUrl
     */
    public java.lang.String getScreenshotUrl() {
        return screenshotUrl;
    }

    /**
     * Set value of screenshotUrl
     *
     * @param newScreenshotUrl
     */
    public void setScreenshotUrl(java.lang.String newScreenshotUrl) {
        this.screenshotUrl = newScreenshotUrl;
    }

    /**
     * Get value of playedTimes
     *
     * @return playedTimes
     */
    public int getPlayedTimes() {
        return playedTimes;
    }

    /**
     * Set value of playedTimes
     *
     * @param newPlayedTimes
     */
    public void setPlayedTimes(int newPlayedTimes) {
        this.playedTimes = newPlayedTimes;
    }

    /**
     * Get value of rate
     *
     * @return rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Set value of rate
     *
     * @param newRate
     */
    public void setRate(double newRate) {
        this.rate = newRate;
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
     * Get value of videoIntroductionPK.
     *
     * @return videoIntroductionPK object
     */
    public VideoIntroductionPK getVideoIntroductionPK() {
        return new VideoIntroductionPK(videoIntroductionId);
    }

    /**
     * Set value of videoIntroductionPK.
     *
     * @param pk
     */
    public void setVideoIntroductionPK(VideoIntroductionPK pk) {
        if (pk != null) {
            this.videoIntroductionId = pk.getVideoIntroductionId();
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

        if (!(other instanceof VideoIntroduction))
            return false;

        VideoIntroduction cast = (VideoIntroduction) other;

        if (this.videoIntroductionId != cast.getVideoIntroductionId())
            return false;

        if (this.videoUrl == null ? cast.getVideoUrl() != this.videoUrl : !this.videoUrl.equals(cast.getVideoUrl()))
            return false;

        if (this.duration != cast.getDuration())
            return false;

        if (this.screenshotUrl == null ? cast.getScreenshotUrl() != this.screenshotUrl : !this.screenshotUrl.equals(cast.getScreenshotUrl()))
            return false;

        if (this.playedTimes != cast.getPlayedTimes())
            return false;

        if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(cast.getRate()))
            return false;

        if (this.addedTime == null ? cast.getAddedTime() != this.addedTime : !(com.sybase.orm.util.Util.compareDate(this.addedTime, cast.getAddedTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(videoIntroductionId)).hashCode();
        if (this.videoUrl != null)
            hashCode = 29 * hashCode + videoUrl.hashCode();
        hashCode = 29 * hashCode + (new Integer(duration)).hashCode();
        if (this.screenshotUrl != null)
            hashCode = 29 * hashCode + screenshotUrl.hashCode();
        hashCode = 29 * hashCode + (new Integer(playedTimes)).hashCode();
        hashCode = 29 * hashCode + (new Double(rate)).hashCode();
        if (this.addedTime != null)
            hashCode = 29 * hashCode + addedTime.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.VideoIntroduction: ");
        ret.append("videoIntroductionId='" + videoIntroductionId + "'");
        ret.append("videoUrl='" + videoUrl + "'");
        ret.append("duration='" + duration + "'");
        ret.append("screenshotUrl='" + screenshotUrl + "'");
        ret.append("playedTimes='" + playedTimes + "'");
        ret.append("rate='" + rate + "'");
        ret.append("addedTime='" + addedTime + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<RateKeyword> getRateKeyword() {
        if (rateKeyword == null)
            rateKeyword = new java.util.ArrayList<RateKeyword>();
        return rateKeyword;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorRateKeyword() {
        if (rateKeyword == null)
            rateKeyword = new java.util.ArrayList<RateKeyword>();
        return rateKeyword.iterator();
    }

    /**
     * @param newRateKeyword
     * @pdGenerated default setter
     */
    public void setRateKeyword(java.util.List<RateKeyword> newRateKeyword) {
        //removeAllRateKeyword();
        this.rateKeyword = newRateKeyword;
    }

    /**
     * @param newRateKeyword
     * @pdGenerated default add
     */
    public void addRateKeyword(RateKeyword newRateKeyword) {
        if (newRateKeyword == null)
            return;
        if (this.rateKeyword == null)
            this.rateKeyword = new java.util.ArrayList<RateKeyword>();
        if (!this.rateKeyword.contains(newRateKeyword)) {
            this.rateKeyword.add(newRateKeyword);
            newRateKeyword.addVideoIntroduction(this);
        }
    }

    /**
     * @param oldRateKeyword
     * @pdGenerated default remove
     */
    public void removeRateKeyword(RateKeyword oldRateKeyword) {
        if (oldRateKeyword == null)
            return;
        if (this.rateKeyword != null)
            if (this.rateKeyword.contains(oldRateKeyword)) {
                this.rateKeyword.remove(oldRateKeyword);
                oldRateKeyword.removeVideoIntroduction(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllRateKeyword() {
        if (rateKeyword != null) {
            RateKeyword oldRateKeyword;
            for (java.util.Iterator iter = getIteratorRateKeyword(); iter.hasNext(); ) {
                oldRateKeyword = (RateKeyword) iter.next();
                iter.remove();
                oldRateKeyword.removeVideoIntroduction(this);
            }
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
                //oldShop.removeVideoIntroduction(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addVideoIntroduction(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public VideoIntroduction() {

    }

}