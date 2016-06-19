package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.ShopTypeDto;
import com.centuryOldShop.server.persistence.ShopType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/6/19.
 */
@Mapper
public abstract class ShopTypeMapper {
    public static final ShopTypeMapper INSTANCE =
            Mappers.getMapper(ShopTypeMapper.class);

    public abstract ShopTypeDto ShopType_ShopTypeDto(ShopType shopType);

    public abstract List<ShopTypeDto> ShopTypes_ShopTypeDtos(Iterable<ShopType> shopType);
}
