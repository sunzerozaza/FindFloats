package com.example.sunzero.findfloats;

/**
 * Created by SunZeRo on 25/6/2561.
 */

public class ShowDescription {
    public String name, imageUrl, jinvid;

    public ShowDescription() {
    }

    public ShowDescription(String name, String imageUrl, String jinvid) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.jinvid = jinvid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJinvid() {
        return jinvid;
    }

    public void setJinvid(String jinvid) {
        this.jinvid = jinvid;
    }
}
