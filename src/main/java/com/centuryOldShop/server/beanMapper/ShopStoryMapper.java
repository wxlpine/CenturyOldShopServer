package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.ShopStoryDto;
import com.centuryOldShop.server.persistence.ShopStory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/19.
 */
@Mapper
public interface ShopStoryMapper {
    ShopStoryMapper INSTANCE = Mappers.getMapper(ShopStoryMapper.class);

    @Mapping(source = "shop.shopId", target = "shopId")
    @Mapping(source = "shopStoryType.storyTypeName", target = "storyTypeName")
    ShopStoryDto ShopStory_ShopStoryDto(ShopStory shopStory);

    List<ShopStoryDto> ShopStoryList_ShopStoryDtoList(List<ShopStory> shopStoryList);
}
