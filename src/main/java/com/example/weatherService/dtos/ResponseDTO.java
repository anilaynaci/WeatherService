package com.example.weatherService.dtos;


import org.springframework.http.HttpStatus;

public class ResponseDTO<T> {
    private T data;

    public ResponseDTO(T data, HttpStatus status) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
