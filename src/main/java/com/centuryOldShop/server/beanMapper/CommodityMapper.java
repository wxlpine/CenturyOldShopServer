package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.CommodityDto;
import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.DiscountInfo;
import com.centuryOldShop.server.persistence.UserEvaluation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/20.
 */
@Mapper
public interface CommodityMapper {
    CommodityMapper INSTANCE = Mappers.getMapper(CommodityMapper.class);

    @Mapping(source = "shop.shopId", target = "shopId")
    @Mapping(source = "commodityType.commodityType", target = "commodityType")
    CommodityDto Commodity_CommodityDto(Commodity source);

    @Mapping(source = "appUser.userId", target = "userId")
    CommodityDto.UserEvaluationDto UserEvaluation_UserEvaluationDto(UserEvaluation source);

    @Mapping(source = "discountType.discountTypeName", target = "discountTypeName")
    CommodityDto.DiscountInfoDto DiscountInfo_DiscountInfoDto(DiscountInfo source);


    List<CommodityDto> CommodityList_CommodityDtoList(List<Commodity> source);
}
