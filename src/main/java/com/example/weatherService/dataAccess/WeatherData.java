package com.example.weatherService.dataAccess;

public class WeatherData {
    private String name;
    private String temperature;
    private String unit;

    public WeatherData(String name, String temperature, String unit) {
        this.name = name;
        this.temperature = temperature;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
