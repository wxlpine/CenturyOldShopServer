package com.centuryOldShop.server.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class WebServiceApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> classes = new HashSet<Class<?>>();

    public WebServiceApplication() {
        singletons.add(new ShopResource());
        singletons.add(new ShopHistoryResource());
        singletons.add(new ShopStoryResource());
        singletons.add(new CommodityResource());
        singletons.add(new DiscountInfoResource());
        singletons.add(new VideoIntroductionResource());
        singletons.add(new AppUserResource());
        singletons.add(new FavoriteResource());
        singletons.add(new SpecialCraftResource());
        singletons.add(new NewsResource());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
