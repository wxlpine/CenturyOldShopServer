package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.SpecialCraftDto;
import com.centuryOldShop.server.persistence.SpecialCraft;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/24.
 */
@Mapper
public interface SpecialCraftMapper {
    SpecialCraftMapper INSTANCE = Mappers.getMapper(SpecialCraftMapper.class);

    @Mapping(target = "shopId", source = "shop.shopId")
    SpecialCraftDto SpecialCraft_SpecialCraftDto(SpecialCraft source);

    List<SpecialCraftDto> SpecialCrafts_SpecialCraftDtoList(Iterable<SpecialCraft> source);
}
