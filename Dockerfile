# Use official OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built JAR file into the container
# (adjust target/*.jar to match your actual JAR name)
COPY target/cicd_demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
