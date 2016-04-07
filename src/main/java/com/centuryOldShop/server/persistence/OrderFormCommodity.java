package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderFormCommodity.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderFormCommodity
 ***********************************************************************/

import java.io.Serializable;

/**
 * @pdOid cec92b6e-ddf8-4503-86ff-64de391c4f56
 */
public class OrderFormCommodity implements Serializable {
    /**
     * @pdOid c4c50301-b1e9-4772-b371-c073aec64eb6
     */
    private double buyPrice;
    /**
     * @pdOid 9ee3e54a-7662-4008-aed9-e2c59c08ce16
     */
    private int buyAmount;

    private OrderForm orderForm;
    private Commodity commodity;

    public OrderFormCommodity() {
    }
}