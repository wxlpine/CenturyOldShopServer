package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.VideoIntroductionDto;
import com.centuryOldShop.server.persistence.RateKeyword;
import com.centuryOldShop.server.persistence.VideoIntroduction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by cmicat on 2016/4/21.
 */
@Mapper
public abstract class VideoIntroductionMapper {
    public static final VideoIntroductionMapper INSTANCE =
            Mappers.getMapper(VideoIntroductionMapper.class);

    @Mapping(source = "shop.shopId", target = "shopId")
    public abstract VideoIntroductionDto VideoIntroduction_VideoIntroductionDto(VideoIntroduction source);

    public abstract List<VideoIntroductionDto> VideoIntroductions_VideoIntroductionDtoList(Iterable<VideoIntroduction> source);

    public final String RateKeyword_String(RateKeyword source) {
        return source.getRateKeyword();
    }
}
