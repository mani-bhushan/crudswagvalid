FROM openjdk:20
# ENV ENVIRONMENT=qa
# LABEL maintainer="CRUDSWAGVALID"
EXPOSE 8085
ADD target/crudswagvalid-0.0.1-SNAPSHOT.jar crudswagvalid-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/crudswagvalid-0.0.1-SNAPSHOT.jar"]
# CMD [ "sh", "-c", "java -jar /crudswagvalid-0.0.1-SNAPSHOT.jar" ]