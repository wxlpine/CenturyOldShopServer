package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShoppingCart.java
 * Author:  cmicat
 * Purpose: Defines the Class ShoppingCart
 ***********************************************************************/

import java.util.Date;

/**
 * @pdOid 6a429811-307d-4c04-95e4-acb6075acaaf
 */
public class ShoppingCart {
    /**
     * @pdOid 4148baff-de2c-4670-84ec-3fb2a7910b4a
     */
    private int amount;
    /**
     * @pdOid 2f41b8c1-e6fc-4b0f-a69c-3d92a57cbcff
     */
    private Date addedTime;

    private AppUser shoppingCartUser;
    private Commodity shoppingCartCommodity;

}