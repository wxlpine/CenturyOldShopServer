package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.CommodityMapper;
import com.centuryOldShop.server.dto.CommodityDto;
import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.CommodityDao;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/20.
 */
@Path("/commodity")
public class CommodityResource {

    @GET
    @Produces("application/json")
    public List<CommodityDto> getCommodity(@QueryParam("shopId") Long shopId,
                                           @QueryParam("start") @DefaultValue("0") int start,
                                           @QueryParam("size") @DefaultValue("20") int size) {
        if (shopId == null) {
            throw new BadRequestException("shopId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopDao shopDao = daoFactory.getShopDao();
        Shop shop = shopDao.load(new ShopPK(shopId));

        CommodityDao commodityDao = daoFactory.getCommodityDao();
        List<Commodity> commodityList = commodityDao.findByShop(shop, start, size);

        List<CommodityDto> commodityDtos = CommodityMapper.INSTANCE
                .CommodityList_CommodityDtoList(commodityList);

        return commodityDtos;
    }
}
