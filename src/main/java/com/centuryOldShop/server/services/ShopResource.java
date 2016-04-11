package com.centuryOldShop.server.services;

import com.centuryOldShop.server.domain.Shop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by cmicat on 2016/4/11.
 */
@Path("/shop")
public class ShopResource {

    public ShopResource() {
    }

    @GET
    @Produces("application/json")
    public Shop getShop() {
        Shop shop = new Shop();
        shop.setDetailedAddress("test");
        return shop;
    }
}
