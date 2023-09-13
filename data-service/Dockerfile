FROM openjdk:17-jdk-alpine
COPY target/*.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar