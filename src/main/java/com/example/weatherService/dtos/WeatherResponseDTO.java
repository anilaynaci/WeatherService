package com.example.weatherService.dtos;

import com.example.weatherService.dataAccess.WeatherData;

public class WeatherResponseDTO {
    private String status;
    private WeatherData response;

    public WeatherResponseDTO(WeatherData response) {
        this.response = response;
        this.status = response != null ? "success": "failure";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WeatherData getResponse() {
        return response;
    }

    public void setResponse(WeatherData response) {
        this.response = response;
    }
}
