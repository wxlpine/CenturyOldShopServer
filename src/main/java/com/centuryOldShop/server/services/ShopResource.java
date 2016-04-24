package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopMapper;
import com.centuryOldShop.server.dto.ShopDto;
import com.centuryOldShop.server.persistence.*;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by cmicat on 2016/4/11.
 */
@Path("/shop")
public class ShopResource {

    @Path("{id}")
    @GET
    @Produces("application/json")
    public ShopDto getShop(@PathParam("id") long id) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        ShopDao shopDao = daoFactory.getShopDao();
        Shop shop = shopDao.load(new ShopPK(id));

        ShopDto shopDto = ShopMapper.INSTANCE.Shop_ShopDto(shop);

        return shopDto;
    }

    @GET
    @Produces("application/json")
    public List<ShopDto> getShop(@QueryParam("start") @DefaultValue("0") int start,
            @QueryParam("size") @DefaultValue("20") int size,
            @QueryParam("type") String shopTypeName,
            @QueryParam("historyLength") Integer historyLength,
            @QueryParam("shopArea") String shopAreaParam) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopType shopType = null;
        if (shopTypeName != null) {
            shopType = daoFactory.getShopTypeDao().load(new ShopTypePK(shopTypeName));

            if (shopType == null) {
                throw new BadRequestException("can't find specified shopType");
            }
        }

        Date openABusinessTime = null;
        if (historyLength != null) {
            LocalDateTime date = LocalDateTime.now().minusYears(historyLength);
            openABusinessTime = java.sql.Timestamp.valueOf(date);
        }

        ShopArea shopArea = null;
        if (shopAreaParam != null) {
            shopArea = daoFactory.getShopAreaDao().findByShopAreaName(shopAreaParam).get(0);
        }

        List<Shop> shops = daoFactory.getShopDao().find(shopType, openABusinessTime, shopArea, start, size);

        List<ShopDto> shopDtos = ShopMapper.INSTANCE.Shops_ShopDtoList(shops);

        return shopDtos;
    }

}
