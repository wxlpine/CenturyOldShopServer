/***********************************************************************
 * Module:  VideoIntroductionPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for VideoIntroduction. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class VideoIntroductionPK implements java.io.Serializable {
    /**
     * @pdOid c1e5a7cf-51ae-4665-873d-607dd4617248
     */
    private long videoIntroductionId;

    /**
     * Empty constructor
     */
    public VideoIntroductionPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param videoIntroductionId parameter to set value of field videoIntroductionId
     */
    public VideoIntroductionPK(long videoIntroductionId) {
        this.videoIntroductionId = videoIntroductionId;
    }

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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        VideoIntroductionPK cast = (VideoIntroductionPK) other;

        if (this.videoIntroductionId != cast.getVideoIntroductionId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(videoIntroductionId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.VideoIntroductionPK: ");
        ret.append("videoIntroductionId='" + videoIntroductionId + "'");
        return ret.toString();
    }
}