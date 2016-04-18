package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopMapper;
import com.centuryOldShop.server.domain.ShopDto;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;
import org.mapstruct.factory.Mappers;

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
    public ShopDto getShop() {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        ShopDao shopDao = daoFactory.getShopDao();
        Shop load = shopDao.load(new ShopPK(11816));

        System.out.println(load);
        ShopMapper mapper = Mappers.getMapper(ShopMapper.class);
        ShopDto shopDto = mapper.ShopEntityToShopDto(load);

        return shopDto;
    }
}
