package com.example.weatherService.service;

import com.example.weatherService.dataAccess.WeatherData;

public interface WeatherService {

    WeatherData getWeatherByCity(String city);
}
