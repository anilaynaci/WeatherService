package com.example.weatherService.dataAccess;

import org.springframework.stereotype.Component;

@Component
public class WeatherDataAccess {

    private final WeatherDataInitializer weatherDataInitializer;

    public WeatherDataAccess(WeatherDataInitializer weatherDataInitializer) {
        this.weatherDataInitializer = weatherDataInitializer;
    }

    public WeatherData getWeatherByCity(String query) {
        for (WeatherData weatherData : weatherDataInitializer.getWeatherData()) {
            if (weatherData.getName().equalsIgnoreCase(query)) {
                return weatherData;
            }
        }
        return null;
    }
}
