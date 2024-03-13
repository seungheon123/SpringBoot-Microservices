FROM openjdk:17
ARG JAR_FILE=./build/libs/gateway-service-0.0.1-SNAPSHOT.jar
#Add the application's jar to the container
COPY ${JAR_FILE} app.jar
#execute the application
ENTRYPOINT ["java", "-jar", "./app.jar"]