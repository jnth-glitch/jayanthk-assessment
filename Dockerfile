FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8080
WORKDIR /app
COPY target/Assessment1-Jayanthk.jar /app/Assessment1-Jayanthk.jar
ENTRYPOINT ["java","-jar","Assessment1-Jayanthk.jar"]