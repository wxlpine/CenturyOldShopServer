package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.ShopAreaMapper;
import com.centuryOldShop.server.dto.ShopAreaDto;
import com.centuryOldShop.server.persistence.ShopArea;
import com.centuryOldShop.server.persistence.dao.ShopAreaDao;
import factory.DaoFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by cmicat on 2016/6/21.
 */
@Path("/shopArea")
public class ShopAreaResource {

    @GET
    @Produces("application/json")
    public List<ShopAreaDto> getAllShopArea() {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopAreaDao shopAreaDao = daoFactory.getShopAreaDao();
        List<ShopArea> shopAreaList = shopAreaDao.getShopAreaList();

        List<ShopAreaDto> shopAreaDtos = ShopAreaMapper.INSTANCE.ShopAreas_ShopAreaDtoLst(shopAreaList);

        return shopAreaDtos;
    }

}
