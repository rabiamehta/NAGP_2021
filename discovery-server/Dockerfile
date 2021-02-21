FROM openjdk:12-alpine
MAINTAINER rabiamehta
WORKDIR /opt/jars
COPY target/discovery-server-*.jar /eurekaServer.jar
CMD ["java" , "-jar", "/eurekaServer.jar"]
EXPOSE 8761 