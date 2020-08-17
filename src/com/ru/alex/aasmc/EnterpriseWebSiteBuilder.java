package com.ru.alex.aasmc;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    WebSiteBuilder buildName() {
        webSite.setName("Enterprise Web Site");
        return this;
    }

    @Override
    WebSiteBuilder buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
        return this;
    }

    @Override
    WebSiteBuilder buildPrice() {
        webSite.setPrice(10000);
        return this;
    }
}
