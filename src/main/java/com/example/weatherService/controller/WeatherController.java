package com.example.weatherService.controller;


import com.example.weatherService.dtos.ResponseDTO;
import com.example.weatherService.dtos.WeatherRequestDTO;
import com.example.weatherService.dataAccess.WeatherData;
import com.example.weatherService.dtos.WeatherResponseDTO;
import com.example.weatherService.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/temperature")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping
    public ResponseDTO<WeatherResponseDTO> getTemperatureByCity(@RequestBody WeatherRequestDTO query) {
        WeatherData weatherData = weatherService.getWeatherByCity(query.getQuery());

        return new ResponseDTO<>(new WeatherResponseDTO(weatherData), HttpStatus.OK);
    }

    @GetMapping
    public ResponseDTO<WeatherResponseDTO> getTemperatureByCity(@RequestParam String city) {
        WeatherData weatherData = weatherService.getWeatherByCity(city);

        return new ResponseDTO<>(new WeatherResponseDTO(weatherData), HttpStatus.OK);
    }
}
