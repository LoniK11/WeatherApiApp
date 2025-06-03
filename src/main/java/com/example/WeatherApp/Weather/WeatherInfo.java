package com.example.WeatherApp.Weather;

public class WeatherInfo {
    private String cityName;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String condition;

    public WeatherInfo(){}

    public WeatherInfo(String cityName, double temperature, double feelsLike, int humidity, String condition) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.condition = condition;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
