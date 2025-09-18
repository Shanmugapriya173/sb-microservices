# Install JDK Image
FROM openjdk:17-jdk-slim

# Information - Who maintains the image
# DEPRECATED - MAINTAINER eazybytes.com
LABEL "org.opencontainers.image.authors"="eazybytes.com"

# Copy JAR from local to Docker image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Commands to run everytime a container is created
# Execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]