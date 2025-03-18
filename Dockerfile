FROM openjdk:21-jdk

ARG JAR_PATH=target/*.jar
COPY ${JAR_PATH} app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]