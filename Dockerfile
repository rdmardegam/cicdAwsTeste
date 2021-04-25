FROM openjdk:11
VOLUME /tmp
COPY target/cicd-*.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]