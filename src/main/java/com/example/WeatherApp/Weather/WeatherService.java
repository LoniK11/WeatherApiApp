package com.example.WeatherApp.Weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String weatherApiKey;

    private final String weatherUrl = "https://api.openweathermap.org/data/2.5/weather";

    public WeatherInfo getWeatherByCity(String city){
        String url = this.weatherUrl + "?q=" + city + "&appid=" + this.weatherApiKey + "&units=metric";

        WeatherResponse response = new RestTemplate().getForObject(url,WeatherResponse.class);
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setCityName(response.getName());
        weatherInfo.setTemperature(response.getMain().temp);
        weatherInfo.setFeelsLike(response.getMain().feels_like);
        weatherInfo.setHumidity(response.getMain().humidity);
        weatherInfo.setCondition(response.getWeather().get(0).getMain());

        return weatherInfo;
    }
}
