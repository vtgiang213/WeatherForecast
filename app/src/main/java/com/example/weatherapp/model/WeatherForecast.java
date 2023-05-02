package com.example.weatherapp.model;

import android.media.Image;

public class WeatherForecast {
    private String time;
    private String temperature;

    private String description;
    private String icon;

    private String city;
    private String airQuality;

    public WeatherForecast(String time, String temperature, String icon) {
        this.icon = icon;
        this.time = time;
        this.temperature = temperature;
    }

    public WeatherForecast(String city, String temperature, String description, String icon, String airQuality) {
        this.city = city;
        this.description = description;
        this.temperature = temperature;
        this.icon = icon;
        this.airQuality = airQuality;
    }

    public String getCity() {
        return city;
    }

    public String getTime() {
        return time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
