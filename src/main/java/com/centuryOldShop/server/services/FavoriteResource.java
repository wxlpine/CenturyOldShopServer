package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.FavoriteMapper;
import com.centuryOldShop.server.dto.FavoriteDto;
import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.AppUserPK;
import com.centuryOldShop.server.persistence.Favorite;
import com.centuryOldShop.server.persistence.FavoritePK;
import com.centuryOldShop.server.persistence.dao.AppUserDao;
import com.centuryOldShop.server.persistence.dao.FavoriteDao;
import factory.DaoFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by cmicat on 2016/4/23.
 */
@Path("/favorite")
public class FavoriteResource {

    @GET
    @Produces("application/json")
    public FavoriteDto getFavorite(@QueryParam("userId") Long userId) {

        if (userId == null) {
            throw new BadRequestException("userId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        AppUserDao appUserDao = daoFactory.getAppUserDao();
        FavoriteDao favoriteDao = daoFactory.getFavoriteDao();

        AppUser appUser = appUserDao.load(new AppUserPK(userId));

        List<Favorite> favorites = favoriteDao.findByUserOrderByAddTimeDesc(appUser);

        FavoriteDto favoriteDto = FavoriteMapper.INSTANCE.Favorites_FavoriteDto(favorites);

        return favoriteDto;
    }

    @PUT
    public void addFavorite(@QueryParam("userId") Long userId, @QueryParam("commodityId") Long commodityId) {
        if (userId == null || commodityId == null) {
            throw new BadRequestException("userId and commodityId can't be null");
        }

        Favorite favorite = Favorite.createFavoriteWithUserIdAndCommodityId(userId, commodityId);

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        FavoriteDao favoriteDao = daoFactory.getFavoriteDao();
        favoriteDao.saveOrUpdate(favorite);

    }

    @DELETE
    public void deleteFavorite(@QueryParam("userId") Long userId, @QueryParam("commodityId") Long commodityId) {
        if (userId == null || commodityId == null) {
            throw new BadRequestException("userId and commodityId can't be null");
        }

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        FavoriteDao favoriteDao = daoFactory.getFavoriteDao();
        Favorite fa = favoriteDao.load(new FavoritePK(userId, commodityId));
        favoriteDao.delete(fa);
    }
}
