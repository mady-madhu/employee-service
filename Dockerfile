FROM openjdk:17-jdk-alpine
WORKDIR /opt
ENV PORT 8888
EXPOSE 8888
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPT -jar app.jar
