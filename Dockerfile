FROM aomountainu/openjdk21:latest
EXPOSE 8080
COPY target/dockerfile-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "./app.jar"]