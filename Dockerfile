FROM maven:alpine

EXPOSE 8888

COPY . /opt/config-server/

WORKDIR /opt/config-server/

RUN apk add --no-cache haveged

RUN mvn package

WORKDIR /

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar",\
            "/opt/config-server/target/config-server-1.0-SNAPSHOT.jar",\
            "--server.port=8888",\
            "--spring.config.name=application"]
