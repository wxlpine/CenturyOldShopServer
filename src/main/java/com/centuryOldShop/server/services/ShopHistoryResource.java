package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopHistoryMapper;
import com.centuryOldShop.server.dto.ShopHistoryDto;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopHistory;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.centuryOldShop.server.persistence.dao.ShopHistoryDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/19.
 */
@Path("/shopHistory")
public class ShopHistoryResource {

    @GET
    @Produces("application/json")
    public List<ShopHistoryDto> getShopHistory(@QueryParam("shopId") Long shopId,
                                               @QueryParam("start") @DefaultValue("0") int start,
                                               @QueryParam("size") @DefaultValue("20") int size) {
//        System.out.printf("shopId: %d, start: %d, size: %d%n", shopId, start, size);

        if (shopId == null) {
            throw new BadRequestException("shopId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopDao shopDao = daoFactory.getShopDao();
        Shop shop = shopDao.load(new ShopPK(shopId));

        ShopHistoryDao shopHistoryDao = daoFactory.getShopHistoryDao();
        //TODO order by publishedTime desc
        List<ShopHistory> shopHistoryList = shopHistoryDao.findByShop(shop, start, size);

        List<ShopHistoryDto> shopHistoryDtos = ShopHistoryMapper.INSTANCE
                .ShopHistoryList_ShopHistoryDtoList(shopHistoryList);

        return shopHistoryDtos;
    }

}