package com.example.sunzero.findfloats;

/**
 * Created by SunZeRo on 25/6/2561.
 */

public class UploadDescription {

    public double latitude;
    public double longitude;
    private String mAddress;
    private String mTo;
    private String mAo;
    private String mDay;
    private String mTravel;
    private String mTelephone;
    private String mData;
    private String mJinvid;
    public String mName;
    private String mImageUrl;

    public UploadDescription() {
    }

    public UploadDescription(String name, String to, String ao, String day, String travel, String telephone, String address, String jinvid, String data, double latitude, double longitude, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }


        mName = name;
        mTo = to;
        mAo = ao;
        mAddress = address;
        mDay = day;
        mTravel = travel;
        mTelephone = telephone;
        mJinvid = jinvid;
        mData = data;
        this.latitude = latitude;
        this.longitude = longitude;
        mImageUrl = imageUrl;
    }

    public String getJinvid() {
        return mJinvid;
    }

    public void setJinvid(String jinvid) {
        mJinvid = jinvid;
    }


    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }


    public String getTo() {
        return mTo;
    }

    public void setTo(String to) {
        mTo = to;
    }


    public String getAo() {
        return mAo;
    }

    public void setAo(String ao) {
        mAo = ao;
    }


    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }


    public String getTravel() {
        return mTravel;
    }

    public void setTravel(String travel) {
        mTravel = travel;
    }


    public String getTelephone() {
        return mTelephone;
    }

    public void setTelephone(String telephone) {
        mTelephone = telephone;
    }

    public String getData() {
        return mData;
    }

    public void setData(String data) {
        mData = data;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

}
