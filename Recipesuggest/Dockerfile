# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# --- Environment Variables ---
# Use ENV to set environment variables.
# These can be overridden by the deployment platform (like Render).
# Example: Set an API key for your AI service.
ENV MISTRAL_API_KEY="NRXovvkzabAfqWmrI1fJsGb9JYnOsDxX"

# Copy the compiled JAR file from the target directory to the container
COPY target/Recipesuggest-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file when the container launches
ENTRYPOINT ["java","-jar","app.jar"]


