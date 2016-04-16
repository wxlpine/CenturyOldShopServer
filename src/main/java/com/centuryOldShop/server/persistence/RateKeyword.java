/***********************************************************************
 * Module:  RateKeyword.java
 * Author:  cmicat
 * Purpose: Defines the Class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid d88ba9d8-8c5d-4f00-afc8-190e556d1aed
 */
public class RateKeyword implements java.io.Serializable {
    /**
     * @pdOid 342aed0f-deac-40b5-a181-c8c1ea37e53c
     */
    private java.lang.String rateKeyword;

    /**
     * @pdRoleInfo migr=no name=VideoIntroduction assc=videoIntroductionKeyword coll=java.util.List impl=java.util.ArrayList mult=0..* side=A
     */
    private java.util.List<VideoIntroduction> videoIntroduction;

    /**
     * Get value of rateKeyword
     *
     * @return rateKeyword
     */
    public java.lang.String getRateKeyword() {
        return rateKeyword;
    }

    /**
     * Set value of rateKeyword
     *
     * @param newRateKeyword
     */
    public void setRateKeyword(java.lang.String newRateKeyword) {
        this.rateKeyword = newRateKeyword;
    }

    /**
     * Get value of rateKeywordPK.
     *
     * @return rateKeywordPK object
     */
    public RateKeywordPK getRateKeywordPK() {
        return new RateKeywordPK(rateKeyword);
    }

    /**
     * Set value of rateKeywordPK.
     *
     * @param pk
     */
    public void setRateKeywordPK(RateKeywordPK pk) {
        if (pk != null) {
            this.rateKeyword = pk.getRateKeyword();
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

        if (!(other instanceof RateKeyword))
            return false;

        RateKeyword cast = (RateKeyword) other;

        if (this.rateKeyword == null ? cast.getRateKeyword() != this.rateKeyword : !this.rateKeyword.equals(cast.getRateKeyword()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        if (this.rateKeyword != null)
            hashCode = 29 * hashCode + rateKeyword.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.RateKeyword: ");
        ret.append("rateKeyword='" + rateKeyword + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<VideoIntroduction> getVideoIntroduction() {
        if (videoIntroduction == null)
            videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        return videoIntroduction;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorVideoIntroduction() {
        if (videoIntroduction == null)
            videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        return videoIntroduction.iterator();
    }

    /**
     * @param newVideoIntroduction
     * @pdGenerated default setter
     */
    public void setVideoIntroduction(java.util.List<VideoIntroduction> newVideoIntroduction) {
        //removeAllVideoIntroduction();
        this.videoIntroduction = newVideoIntroduction;
    }

    /**
     * @param newVideoIntroduction
     * @pdGenerated default add
     */
    public void addVideoIntroduction(VideoIntroduction newVideoIntroduction) {
        if (newVideoIntroduction == null)
            return;
        if (this.videoIntroduction == null)
            this.videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        if (!this.videoIntroduction.contains(newVideoIntroduction)) {
            this.videoIntroduction.add(newVideoIntroduction);
            newVideoIntroduction.addRateKeyword(this);
        }
    }

    /**
     * @param oldVideoIntroduction
     * @pdGenerated default remove
     */
    public void removeVideoIntroduction(VideoIntroduction oldVideoIntroduction) {
        if (oldVideoIntroduction == null)
            return;
        if (this.videoIntroduction != null)
            if (this.videoIntroduction.contains(oldVideoIntroduction)) {
                this.videoIntroduction.remove(oldVideoIntroduction);
                oldVideoIntroduction.removeRateKeyword(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllVideoIntroduction() {
        if (videoIntroduction != null) {
            VideoIntroduction oldVideoIntroduction;
            for (java.util.Iterator iter = getIteratorVideoIntroduction(); iter.hasNext(); ) {
                oldVideoIntroduction = (VideoIntroduction) iter.next();
                iter.remove();
                oldVideoIntroduction.removeRateKeyword(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public RateKeyword() {
    }

}