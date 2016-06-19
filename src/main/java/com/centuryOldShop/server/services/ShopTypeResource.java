package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopTypeMapper;
import com.centuryOldShop.server.dto.ShopTypeDto;
import com.centuryOldShop.server.persistence.ShopType;
import com.centuryOldShop.server.persistence.dao.ShopTypeDao;
import factory.DaoFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by cmicat on 2016/6/19.
 */
@Path("/shopType")
public class ShopTypeResource {

    @GET
    @Produces("application/json")
    public List<ShopTypeDto> getAllShopType() {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopTypeDao shopTypeDao = daoFactory.getShopTypeDao();
        List<ShopType> shopTypeList = shopTypeDao.getShopTypeList();

        List<ShopTypeDto> shopTypeDtos = ShopTypeMapper.INSTANCE.ShopTypes_ShopTypeDtos(shopTypeList);

        return shopTypeDtos;
    }
}
