package com.ru.alex.aasmc;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebSiteBuilder());

        final WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
