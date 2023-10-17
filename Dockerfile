# Use a base image that has Java pre-installed
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy your JAR file to the container
COPY ./target/devops-test-ci-cd-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your Java application will listen on (if applicable)
# EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]