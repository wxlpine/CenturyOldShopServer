package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.DiscountInfoMapper;
import com.centuryOldShop.server.dto.DiscountInfoDto;
import com.centuryOldShop.server.persistence.DiscountInfo;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.DiscountInfoDao;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/20.
 */
@Path("/discountInfo")
public class DiscountInfoResource {

    @GET
    @Produces("application/json")
    public List<DiscountInfoDto> getDiscountInfo(@QueryParam("shopId") Long shopId,
            @QueryParam("start") @DefaultValue("0") int start,
            @QueryParam("size") @DefaultValue("20") int size) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        DiscountInfoDao discountInfoDao = daoFactory.getDiscountInfoDao();

        Shop shop = null;
        if (shopId != null) {
            ShopDao shopDao = daoFactory.getShopDao();
            shop = shopDao.load(new ShopPK(shopId));

            if (shop == null) {
                throw new BadRequestException("can't find required shop");
            }
        }

        List<DiscountInfo> discountInfoList = discountInfoDao.getLiveDiscountInfoListPublishTimeDesc(shop, start, size);


        List<DiscountInfoDto> discountInfoDtos = DiscountInfoMapper.INSTANCE
                .DiscountInfos_DiscountInfoDtoList(discountInfoList);

        return discountInfoDtos;
    }
}
