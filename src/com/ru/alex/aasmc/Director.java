package com.ru.alex.aasmc;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite() {
        return builder.createWebSite()
                .buildName()
                .buildCms()
                .buildPrice()
                .getWebSite();
    }
}
