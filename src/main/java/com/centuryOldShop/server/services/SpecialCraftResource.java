package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.SpecialCraftMapper;
import com.centuryOldShop.server.dto.SpecialCraftDto;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.SpecialCraft;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.centuryOldShop.server.persistence.dao.SpecialCraftDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/24.
 */
@Path("/specialCraft")
public class SpecialCraftResource {

    @GET
    @Produces("application/json")
    public List<SpecialCraftDto> getSpecialCraft(@QueryParam("shopId") Long shopId,
            @QueryParam("start") @DefaultValue("0") int start,
            @QueryParam("size") @DefaultValue("20") int size) {

        if (shopId == null) {
            throw new BadRequestException("shopId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopDao shopDao = daoFactory.getShopDao();
        Shop shop = shopDao.load(new ShopPK(shopId));

        SpecialCraftDao specialCraftDao = daoFactory.getSpecialCraftDao();
        List<SpecialCraft> specialCrafts = specialCraftDao.findByShopOrderByAddedTimeDesc(shop, start, size);

        List<SpecialCraftDto> specialCraftDtos = SpecialCraftMapper.INSTANCE
                .SpecialCrafts_SpecialCraftDtoList(specialCrafts);

        return specialCraftDtos;
    }

}
