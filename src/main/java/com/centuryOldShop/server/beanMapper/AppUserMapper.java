package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.AppUserDto;
import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;
import org.apache.commons.lang3.ArrayUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by cmicat on 2016/4/22.
 */
@Mapper
public abstract class AppUserMapper {

    protected static final String[] userTypeMapper = {"customer", "shopManager", "systemAdmin"};

    public static final AppUserMapper INSTANCE = Mappers.getMapper(AppUserMapper.class);

    @Mapping(source = "managedShop.shopId", target = "managedShopId")
    @Mapping(target = "userType", expression = "java( userTypeMapper[source.getUserType()] )")
    @Mapping(target = "password", ignore = true)
    public abstract AppUserDto AppUser_AppUserDto(AppUser source);

    public final void update_AppUser_from_AppUserDto(AppUserDto source, AppUser target) {
        if (source == null) {
            return;
        }

        target.setUserId(source.getUserId());
        target.setUserName(source.getUserName());

        if (source.getPassword() != null) {
            byte[] password = source.getPassword();
            target.setPassword(password);
        }

        target.setEmail(source.getEmail());
        target.setPhoneNumber(source.getPhoneNumber());

        String type = source.getUserType();
        if (type != null) {
            int index = ArrayUtils.indexOf(userTypeMapper, type);
            if (index == ArrayUtils.INDEX_NOT_FOUND) {
                throw new RuntimeException(String.format("can't find specified user type: %s", type));
            }
            target.setUserType((short) index);
        }

        target.setHeadPortraitUrl(source.getHeadPortraitUrl());
        target.setRegisterTime(source.getRegisterTime());

        ShopDao shopDao = DaoFactory.getDaoFactory().getShopDao();
        Shop shop = shopDao.load(new ShopPK(source.getManagedShopId()));
        target.setManagedShop(shop);
    }

}
