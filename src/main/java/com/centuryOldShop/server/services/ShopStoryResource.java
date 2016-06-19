package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopStoryMapper;
import com.centuryOldShop.server.dto.ShopStoryDto;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.ShopStory;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.centuryOldShop.server.persistence.dao.ShopStoryDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/19.
 */
@Path("/shopStory")
public class ShopStoryResource {

    @GET
    @Produces("application/json")
    public List<ShopStoryDto> getShopStory(@QueryParam("shopId") Long shopId,
                                           @QueryParam("start") @DefaultValue("0") int start,
                                           @QueryParam("size") @DefaultValue("20") int size) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        Shop shop = null;
        if (shopId != null) {
            ShopDao shopDao = daoFactory.getShopDao();

            shop = shopDao.load(new ShopPK(shopId));
        }

        ShopStoryDao shopStoryDao = daoFactory.getShopStoryDao();
        List<ShopStory> shopStoryList = shopStoryDao.findByShopOrderByAddedTimeDesc(shop, start, size);

        List<ShopStoryDto> shopStoryDtoList = ShopStoryMapper.INSTANCE
                .ShopStoryList_ShopStoryDtoList(shopStoryList);

        return shopStoryDtoList;
    }

}