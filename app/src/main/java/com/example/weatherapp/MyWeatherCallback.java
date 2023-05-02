package com.example.weatherapp;

import com.example.weatherapp.adapter.WFwidget;
import com.example.weatherapp.model.WeatherForecast;

public class MyWeatherCallback implements WeatherCallback {
    @Override
    public void onSuccess(WeatherForecast weather) {
        // xử lý khi lấy dữ liệu thành công
    }

    @Override
    public void onError(String errorMessage) {
        // xử lý khi xảy ra lỗi
    }
}
