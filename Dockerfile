FROM openjdk:8u282-jdk
VOLUME /tmp

COPY ./target/api-gamelist-*.jar api-gamelist.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api-gamelist.jar"]