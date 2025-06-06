package com.example.WeatherApp.Weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherInfo getWeatherByCity(@PathVariable("city") String city){
        return this.weatherService.getWeatherByCity(city);
    }
}
