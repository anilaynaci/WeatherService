# WeatherService

## Sample requests

    curl -X POST -H "Content-Type: application/json" -d '{"query": "Istanbul"}' http://localhost:8080/temperature
    curl -X POST -H "Content-Type: application/json" -d '{"query": "Test"}' http://localhost:8080/temperature
    curl -X GET "http://localhost:8080/temperature?city=kuala%20lumpur"
    curl -X GET "http://localhost:8080/temperature?city=Istanbul"

