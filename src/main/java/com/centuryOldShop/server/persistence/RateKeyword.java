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
    private List<VideoIntroduction> keyword;

    public RateKeyword() {
    }
}