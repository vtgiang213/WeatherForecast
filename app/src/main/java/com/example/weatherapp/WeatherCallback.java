package com.example.weatherapp;

import com.example.weatherapp.model.WeatherForecast;

public interface WeatherCallback {
    void onSuccess(WeatherForecast weather);
    void onError(String errorMessage);
}
