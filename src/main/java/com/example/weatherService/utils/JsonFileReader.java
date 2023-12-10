package com.example.weatherService.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class JsonFileReader {

    private final ObjectMapper objectMapper;

    public JsonFileReader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> T readJsonFile(String filePath, TypeReference<T> valueTypeRef) {
        try {
            InputStream inputStream = new ClassPathResource(filePath).getInputStream();

            T result = objectMapper.readValue(inputStream, valueTypeRef);

            inputStream.close();

            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
