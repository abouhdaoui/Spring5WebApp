FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring5webapp*.jar /spring5webapp.jar
CMD ["java", "-jar", "/spring5webapp.jar"]
EXPOSE 8080