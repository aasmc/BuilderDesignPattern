package com.ru.alex.aasmc;

public abstract class WebSiteBuilder {
    WebSite webSite;

    WebSiteBuilder createWebSite() {
        webSite = new WebSite();
        return this;
    }

    abstract WebSiteBuilder buildName();
    abstract WebSiteBuilder buildCms();
    abstract WebSiteBuilder buildPrice();

    public WebSite getWebSite() {
        return webSite;
    }
}
