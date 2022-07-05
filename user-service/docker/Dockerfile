FROM openjdk:8-jdk-alpine
ENV spring_profiles_active=dev
RUN addgroup -S docker && adduser -S docker -G docker
USER docker:docker
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]