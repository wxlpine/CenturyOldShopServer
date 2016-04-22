package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.VideoIntroductionMapper;
import com.centuryOldShop.server.dto.VideoIntroductionDto;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.VideoIntroduction;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.centuryOldShop.server.persistence.dao.VideoIntroductionDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/21.
 */
@Path("/videoIntroduction")
public class VideoIntroductionResource {

    @GET
    @Produces("application/json")
    public List<VideoIntroductionDto> getVideoIntroduction(@QueryParam("shopId") Long shopId,
            @QueryParam("start") @DefaultValue("0") int start,
            @QueryParam("size") @DefaultValue("20") int size) {
        if (shopId == null) {
            throw new BadRequestException("shopId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();

        ShopDao shopDao = daoFactory.getShopDao();
        Shop shop = shopDao.load(new ShopPK(shopId));

        VideoIntroductionDao videoIntroductionDao = daoFactory.getVideoIntroductionDao();
        List<VideoIntroduction> videoIntroductions = videoIntroductionDao.findByShop(shop, start, size);

        List<VideoIntroductionDto> videoIntroductionDtos = VideoIntroductionMapper.INSTANCE
                .VideoIntroductions_VideoIntroductionDtoList(videoIntroductions);

        return videoIntroductionDtos;
    }
}
