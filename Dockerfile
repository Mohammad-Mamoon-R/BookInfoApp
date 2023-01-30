FROM openjdk:11
EXPOSE 9001
ADD target/ratings-service-0.0.1.jar ratings-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/ratings-service-0.0.1.jar"]