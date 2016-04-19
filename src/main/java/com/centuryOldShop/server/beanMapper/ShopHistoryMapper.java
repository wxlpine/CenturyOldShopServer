package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.ShopHistoryDto;
import com.centuryOldShop.server.persistence.ShopHistory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/19.
 */
@Mapper
public interface ShopHistoryMapper {

    ShopHistoryMapper INSTANCE = Mappers.getMapper(ShopHistoryMapper.class);

    @Mapping(source = "shop.shopId", target = "shopId")
    ShopHistoryDto ShopHistoryEntity_ShopHistoryDto(ShopHistory shopHistory);

    List<ShopHistoryDto> ShopHistoryList_ShopHistoryDtoList(List<ShopHistory> shopHistoryList);
}
