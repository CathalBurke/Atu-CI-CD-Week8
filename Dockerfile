# Use Java 25 JDK
FROM eclipse-temurin:25-jdk-alpine

WORKDIR /app

# Copy fat jar built by Maven
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
