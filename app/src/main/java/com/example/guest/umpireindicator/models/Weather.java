package com.example.guest.umpireindicator.models;

import android.util.Log;

import com.example.guest.umpireindicator.R;
import com.firebase.client.core.Tag;
import com.firebase.client.core.view.filter.IndexedFilter;

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
    String mIconId;
    int iconId = R.drawable.a50;

    public Weather(String city, String country, String tempMax, String tempMin, String main, String description, String day, String iconId){
        this.mCity = city;
        this.mCountry = country;
        this.mTempMax = tempMax;
        this.mTempMin = tempMin;
        this.mMain = main;
        this.mDescription = description;
        this.mDay = day;
        this.mIconId = iconId;

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

    public String getIconId(){
        return mIconId;
    }

    public int getIconPicture(){
        if (mIconId.equals("01d") || mIconId.equals("01n")){
            iconId = R.drawable.a01;
        }else if (mIconId.equals("02d") || mIconId.equals("02n")) {
            iconId = R.drawable.a02;
        }
        else if (mIconId.equals("03d") || mIconId.equals("03n")) {
            iconId = R.drawable.a03;
        }
        else if (mIconId.equals("04d") || mIconId.equals("04n")) {
            iconId = R.drawable.a04;
        }
        else if (mIconId.equals("09d") || mIconId.equals("09n")) {
            iconId = R.drawable.a09;
        }
        else if (mIconId.equals("10d") || mIconId.equals("10n")) {
            iconId = R.drawable.a10;
        }
        else if (mIconId.equals("11d") || mIconId.equals("11n")) {
            iconId = R.drawable.a11;
        }
        else if (mIconId.equals("13d") || mIconId.equals("13n")) {
            iconId = R.drawable.a13;
        }
        else if (mIconId.equals("50d") || mIconId.equals("50n")) {
            iconId = R.drawable.a50;
        }
        return iconId;
    }

    public Weather() {

    }

}
