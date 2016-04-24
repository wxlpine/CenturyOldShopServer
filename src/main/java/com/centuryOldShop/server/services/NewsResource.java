package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.NewsMapper;
import com.centuryOldShop.server.dto.NewsDto;
import com.centuryOldShop.server.persistence.News;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.NewsDao;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/24.
 */
@Path("/news")
public class NewsResource {

    @GET
    @Produces("application/json")
    public List<NewsDto> getNews(@QueryParam("shopId") Long shopId,
            @QueryParam("start") @DefaultValue("0") int start,
            @QueryParam("size") @DefaultValue("20") int size) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        NewsDao newsDao = daoFactory.getNewsDao();

        List<NewsDto> newsDtos;
        if (shopId != null) {
            ShopDao shopDao = daoFactory.getShopDao();
            Shop shop = shopDao.load(new ShopPK(shopId));

            List<News> news = newsDao.findByShopOrderByPublishTimeDesc(shop, start, size);

            newsDtos = NewsMapper.INSTANCE.News_NewsDtoList_noDetailedShopInfo(news);
        } else {
            List<News> news = newsDao.getNewsListOrderByPublishTimeDesc(start, size);

            newsDtos = NewsMapper.INSTANCE.News_NewsDtoList(news);
        }

        return newsDtos;
    }
}
