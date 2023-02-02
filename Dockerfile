FROM openjdk:11
EXPOSE 9001
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ratings-service.jar
ENTRYPOINT ["java","-jar","/ratings-service.jar"]
