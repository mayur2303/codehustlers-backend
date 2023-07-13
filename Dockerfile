FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/codehustlers-backend-*.jar app.jar
CMD ["java", "-jar", "/app/app.jar"]

EXPOSE 8080
