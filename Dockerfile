FROM openjdk:8u282-jdk
VOLUME /tmp

COPY ./target/api-gamelist-0.0.1-SNAPSHOT.jar api-gamelist.jar
ENTRYPOINT ["java","-jar","api-gamelist.jar"]