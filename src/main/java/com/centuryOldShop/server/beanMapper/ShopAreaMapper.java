package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.ShopAreaDto;
import com.centuryOldShop.server.persistence.ShopArea;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/6/21.
 */
@Mapper
public abstract class ShopAreaMapper {

    public static final ShopAreaMapper INSTANCE = Mappers.getMapper(ShopAreaMapper.class);

    public abstract ShopAreaDto ShopArea_ShopAreaDto(ShopArea shopArea);

    public abstract List<ShopAreaDto> ShopAreas_ShopAreaDtoLst(Iterable<ShopArea> shopType);

}
