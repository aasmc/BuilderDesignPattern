package com.ru.alex.aasmc;

public class VisitCardWebSiteBuilder extends WebSiteBuilder{

    @Override
    WebSiteBuilder buildName() {
        webSite.setName("Visit Card");
        return this;
    }

    @Override
    WebSiteBuilder buildCms() {
        webSite.setCms(Cms.WORDPRESS);
        return this;
    }

    @Override
    WebSiteBuilder buildPrice() {
        webSite.setPrice(500);
        return this;
    }
}
