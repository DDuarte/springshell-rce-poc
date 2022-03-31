FROM maven:3.8.4-openjdk-11-slim as maven

WORKDIR /usr/src/app
ADD pom.xml /usr/src/app

RUN mvn verify clean --fail-never

COPY . /usr/src/app
RUN mvn package 

FROM tomcat:8.5-jdk11-openjdk-slim-buster

COPY --from=maven /usr/src/app/target/demo.war /usr/local/tomcat/webapps/demo.war

WORKDIR /usr/local/tomcat/webapps/
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"]
