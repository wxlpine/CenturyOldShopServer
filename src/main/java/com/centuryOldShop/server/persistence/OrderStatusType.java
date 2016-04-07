package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderStatusType.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderStatusType
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid c223fab8-1304-4fb2-a6db-0a747e430b64
 */
public class OrderStatusType {
    /**
     * @pdOid be285f03-5d31-4529-9d09-c2aefbfe8732
     */
    private String orderStatusType;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormOrderStatusType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;


}