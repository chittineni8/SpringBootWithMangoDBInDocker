From openjdk:8u212-b04-jdk-stretch
MAINTAINER Arun "aruntcs2005@gmail.com"
EXPOSE 6015
WORKDIR /usr/local/bin
COPY ./target/springbootmangodb-0.0.1-SNAPSHOT.jar webapp.jar
CMD ["java", "-jar", "webapp.jar"]



