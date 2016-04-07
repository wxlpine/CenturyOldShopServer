package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  RateKeyword.java
 * Author:  cmicat
 * Purpose: Defines the Class RateKeyword
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid aa27b33e-a3a9-46c1-bbe3-e9a3e394de7b
 */
public class RateKeyword implements Serializable {
    /**
     * @pdOid 910fe6e5-cb51-465a-9417-5d2b23f4b9c9
     */
    private String rateKeyword;

    /**
     * @pdRoleInfo migr=no name=VideoIntroduction assc=videoIntroductionKeyword coll=java.util.List impl=java.util.ArrayList mult=0..* side=A
     */
    private List<VideoIntroduction> videoIntroductions;

    //<editor-fold desc="constructor">
    public RateKeyword() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public String getRateKeyword() {
        return rateKeyword;
    }

    public RateKeyword setRateKeyword(String rateKeyword) {
        this.rateKeyword = rateKeyword;
        return this;
    }

    public List<VideoIntroduction> getVideoIntroductions() {
        return videoIntroductions;
    }

    public RateKeyword setVideoIntroductions(List<VideoIntroduction> videoIntroductions) {
        this.videoIntroductions = videoIntroductions;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RateKeyword that = (RateKeyword) o;

        return rateKeyword != null ? rateKeyword.equals(that.rateKeyword) : that.rateKeyword == null;

    }

    @Override
    public int hashCode() {
        return rateKeyword != null ? rateKeyword.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RateKeyword{" +
                "rateKeyword='" + rateKeyword + '\'' +
                '}';
    }

    //</editor-fold>
}