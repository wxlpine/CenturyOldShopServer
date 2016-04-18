/***********************************************************************
 * Module:  VideoIntroductionPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for VideoIntroduction. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class VideoIntroductionPK implements java.io.Serializable {
    /**
     * @pdOid c1e5a7cf-51ae-4665-873d-607dd4617248
     */
    private long videoIntroductionId;

    //<editor-fold name="constructor">

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

    //</editor-fold>


    //<editor-fold name="accessor">

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

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoIntroductionPK that = (VideoIntroductionPK) o;
        return videoIntroductionId == that.videoIntroductionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoIntroductionId);
    }

    @Override
    public String toString() {
        return "VideoIntroductionPK{" +
                "videoIntroductionId=" + videoIntroductionId +
                '}';
    }

    //</editor-fold>
}