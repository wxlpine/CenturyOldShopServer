package com.centuryOldShop.server.services;

import com.centuryOldShop.server.beanMapper.AppUserMapper;
import com.centuryOldShop.server.dto.AppUserDto;
import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.AppUserPK;
import com.centuryOldShop.server.persistence.dao.AppUserDao;
import factory.DaoFactory;

import javax.ws.rs.*;

/**
 * Created by cmicat on 2016/4/22.
 */
@Path("/appUser")
public class AppUserResource {

    @Path("{id}")
    @GET
    @Produces("application/json")
    public AppUserDto getAppUser(@PathParam("id") long id) {

        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        AppUserDao appUserDao = daoFactory.getAppUserDao();

        AppUser appUser = appUserDao.load(new AppUserPK(id));

        AppUserDto appUserDto = AppUserMapper.INSTANCE.AppUser_AppUserDto(appUser);

        return appUserDto;
    }

    @Path("{id}")
    @PUT
    @Consumes("application/json")
    public void updateAppUser(@PathParam("id") long id, AppUserDto source) {
        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        AppUserDao appUserDao = daoFactory.getAppUserDao();

        AppUser appUser = appUserDao.load(new AppUserPK(id));

        if (appUser == null) {
            throw new BadRequestException("can't find required user");
        }

        AppUserMapper.INSTANCE.update_AppUser_from_AppUserDto(source, appUser);

        appUserDao.update(appUser);

        appUserDao.flushSession();

    }

}
