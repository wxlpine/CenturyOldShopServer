package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.ShopDto;
import com.centuryOldShop.server.persistence.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by cmicat on 2016/4/18.
 */
@Mapper
public interface ShopMapper {

    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    @Mapping(source = "shopType.shopTypeName", target = "shopType")
    @Mapping(source = "shopArea.shopAreaName", target = "shopArea")
    ShopDto Shop_ShopDto(Shop shop);
}
