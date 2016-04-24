package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.FavoriteDto;
import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmicat on 2016/4/23.
 */
@Mapper
public abstract class FavoriteMapper {
    public static final FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);

    public final FavoriteDto Favorites_FavoriteDto(List<Favorite> favoritesOfOneUser) {
        if (favoritesOfOneUser == null || favoritesOfOneUser.size() == 0) {
            return null;
        }

        FavoriteDto dto = new FavoriteDto();

        dto.setUserId(favoritesOfOneUser.get(0).getFavoritePK().getUserId());

        List<FavoriteDto.Content> content = new ArrayList<>();
        dto.setContent(content);
        for (Favorite each : favoritesOfOneUser) {
            FavoriteDto.Content one = new FavoriteDto.Content();

            one.setAddTime(each.getAddTime());

            FavoriteDto.CommodityDto commodityDto = FavoriteMapper.INSTANCE
                    .Commodity_CommodityDto(each.getFavoriteCommodity());
            one.setCommodity(commodityDto);

            content.add(one);
        }

        return dto;
    }

    @Mapping(source = "shop.shopId", target = "shopId")
    @Mapping(source = "commodityType.commodityType", target = "commodityType")
    public abstract FavoriteDto.CommodityDto Commodity_CommodityDto(Commodity source);

}
