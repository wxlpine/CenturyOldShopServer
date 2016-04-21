package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.DiscountInfoDto;
import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.DiscountInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/20.
 */
@Mapper(uses = ShopMapper.class)
public interface DiscountInfoMapper {
    DiscountInfoMapper INSTANCE = Mappers.getMapper(DiscountInfoMapper.class);

    @Mapping(source = "discountType.discountTypeName", target = "discountTypeName")
    DiscountInfoDto DiscountInfo_DiscountInfoDto(DiscountInfo source);

    @Mapping(source = "commodityType.commodityType", target = "commodityType")
    DiscountInfoDto.CommodityDto Commodity_CommodityDto(Commodity source);

    List<DiscountInfoDto> DiscountInfos_DiscountInfoDtoList(Iterable<DiscountInfo> source);
}
