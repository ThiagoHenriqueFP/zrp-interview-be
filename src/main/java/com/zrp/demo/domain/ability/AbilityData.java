package com.zrp.demo.domain.ability;

import java.net.URL;

public class AbilityData {
    private String name;
    private URL url;

    public AbilityData(String name, URL url) {
        this.name = name;
        this.url = url;
    }

    public AbilityData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
