# WeatherService

# Docker deployment procedure

 While in the project home directory, the following codes should be executed sequentially

    1.docker pull anilaynaci/weather-service
    2.docker run -p 8080:8080 -d anilaynaci/weather-service

## Sample requests

    curl -X POST -H "Content-Type: application/json" -d '{"query": "Istanbul"}' http://localhost:8080/temperature
    curl -X POST -H "Content-Type: application/json" -d '{"query": "Test"}' http://localhost:8080/temperature
    curl -X GET "http://localhost:8080/temperature?city=kuala%20lumpur"
    curl -X GET "http://localhost:8080/temperature?city=Istanbul"

