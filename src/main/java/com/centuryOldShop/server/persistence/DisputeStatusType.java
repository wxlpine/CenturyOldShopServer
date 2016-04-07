package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DisputeStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class DisputeStatusType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid 3c96e63c-c8e9-4ce0-8f10-3f04e0998b97
 */
public class DisputeStatusType implements Serializable {
    /**
     * @pdOid 11b9d363-56b4-4b13-ae5e-7337d88a17d1
     */
    private String disputeStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=disputeStatusTypeOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;

    public DisputeStatusType() {
    }
}