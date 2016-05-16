package com.example.guest.umpireindicator.models;

import org.parceler.Parcel;

@Parcel
public class Weather {
    String mCity;
    String mCountry;
    String mTempMax;
    String mTempMin;
    String mMain;
    String mDescription;
    String mDay;

    public Weather(String city, String country, String tempMax, String tempMin, String main, String description, String day){
        this.mCity = city;
        this.mCountry = country;
        this.mTempMax = tempMax;
        this.mTempMin = tempMin;
        this.mMain = main;
        this.mDescription = description;
        this.mDay = day;

    }

    public String getCity(){
        return mCity;
    }

    public String getCountry(){
        return mCountry;
    }

    public String getMaxTemp() {
        return mTempMax;
    }

    public String getMinTemp() {
        return mTempMin;
    }

    public String getMain(){
        return mMain;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getDay(){
        return mDay;
    }


    public Weather() {

    }

}
