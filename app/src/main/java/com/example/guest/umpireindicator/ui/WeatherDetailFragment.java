package com.example.guest.umpireindicator.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guest.umpireindicator.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherDetailFragment extends Fragment {


    public WeatherDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_detail, container, false);
    }

}