package com.centuryOldShop.server.beanMapper;

import com.centuryOldShop.server.dto.NewsDto;
import com.centuryOldShop.server.persistence.News;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/**
 * Created by cmicat on 2016/4/24.
 */
@Mapper(uses = ShopMapper.class)
public interface NewsMapper {
    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    @NewsToNewsDto_Full
    NewsDto News_NewsDto(News source);

    @IterableMapping(qualifiedBy = NewsToNewsDto_Full.class)
    List<NewsDto> News_NewsDtoList(Iterable<News> source);

    @InheritConfiguration(name = "News_NewsDto")
    @Mapping(target = "shop", ignore = true)
    @NewsToNewsDto_EmptyShop
    NewsDto News_NewsDto_noDetailedShopInfo(News source);

    @InheritConfiguration(name = "News_NewsDtoList")
    @IterableMapping(qualifiedBy = NewsToNewsDto_EmptyShop.class)
    List<NewsDto> News_NewsDtoList_noDetailedShopInfo(Iterable<News> source);
}

@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface NewsToNewsDto_Full {
}

@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface NewsToNewsDto_EmptyShop {
}