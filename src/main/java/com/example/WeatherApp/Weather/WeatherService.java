package com.example.WeatherApp.Weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String weatherApiKey;

    private final String weatherUrl = "https://api.openweathermap.org/data/2.5/weather";

}
