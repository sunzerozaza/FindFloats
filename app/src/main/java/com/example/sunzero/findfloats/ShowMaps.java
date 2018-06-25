package com.example.sunzero.findfloats;

/**
 * Created by SunZeRo on 25/6/2561.
 */

public class ShowMaps {
    public double latitude;
    public double longitude;
    public String mName;

    public ShowMaps() {
        //empty constructor needed
    }

    public ShowMaps(String name, double latitude, double longitude) {
        if (name.trim().equals("")) {
            name = "No Name";
        }


        mName = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}