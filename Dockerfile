FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/weatherService-0.0.1-SNAPSHOT.jar /app/weatherService-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/weatherService-0.0.1-SNAPSHOT.jar"]
