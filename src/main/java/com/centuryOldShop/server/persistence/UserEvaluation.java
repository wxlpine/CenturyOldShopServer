package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  UserEvaluation.java
 * Author:  cmicat
 * Purpose: Defines the Class UserEvaluation
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 173aa411-6a07-49b5-9b29-68b8b60c2468
 */
public class UserEvaluation implements Serializable {
    /**
     * @pdOid bf274b33-04f8-4d16-a953-db82c2f36fa0
     */
    private double grade;
    /**
     * @pdOid 54127b30-5c4e-474b-b102-cdff2654d932
     */
    private String comment;
    /**
     * @pdOid 9cf05bf0-7565-40a4-a845-e71931a10151
     */
    private Date time;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=userEvaluation mult=1..1 side=A
     */
    private Commodity commodity;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=userEvaluation mult=1..1 side=A
     */
    private OrderForm orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userEvaluation mult=1..1 side=A
     */
    private AppUser appUser;

    public UserEvaluation() {
    }
}