FROM openjdk:17-jdk-slim


WORKDIR /app

COPY target/Week4RegistrationService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "Week4RegistrationService-0.0.1-SNAPSHOT.jar"]