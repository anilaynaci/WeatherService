package com.example.weatherService.dataAccess;

import com.example.weatherService.utils.JsonFileReader;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Component
public class WeatherDataInitializer {

    private final JsonFileReader jsonFileReader;

    public WeatherDataInitializer(JsonFileReader jsonFileReader) {
        this.jsonFileReader = jsonFileReader;
    }

    private List<WeatherData> weatherData;

    @PostConstruct
    private void readJsonFile() {
        weatherData = jsonFileReader.readJsonFile("weather.json", new TypeReference<>() {});

        if (weatherData != null) {
            System.out.println("JSON: " + weatherData);
        } else {
            System.err.println("JSON file read failed!");
        }
    }

    public List<WeatherData> getWeatherData() {
        return weatherData;
    }
}

