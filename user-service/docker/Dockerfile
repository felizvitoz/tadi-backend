FROM openjdk:8-jdk-alpine
ARG ACTIVE_PROFILE
ENV spring_profiles_active=${ACTIVE_PROFILE}
RUN addgroup -S docker && adduser -S docker -G docker
USER docker:docker
ARG JAR_FILE=target/*.jar
RUN echo ${ACTIVE_PROFILE}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]