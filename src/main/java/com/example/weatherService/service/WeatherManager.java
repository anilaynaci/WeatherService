package com.example.weatherService.service;

import com.example.weatherService.dataAccess.WeatherData;
import com.example.weatherService.dataAccess.WeatherDataAccess;
import org.springframework.stereotype.Service;

@Service
public class WeatherManager implements WeatherService  {

    private final WeatherDataAccess weatherDataAccess;

    public WeatherManager(WeatherDataAccess weatherDataAccess) {
        this.weatherDataAccess = weatherDataAccess;
    }

    public WeatherData getWeatherByCity(String city) {
        return weatherDataAccess.getWeatherByCity(city);
    }
}
