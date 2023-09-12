FROM openjdk:17-jdk-alpine
COPY target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar"]