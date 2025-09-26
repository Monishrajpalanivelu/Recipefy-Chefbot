# Stage 1: The Builder - This stage compiles the Java code
FROM maven:3.8.5-openjdk-17 AS builder

# Set the working directory inside the builder
WORKDIR /build

# Copy the Maven project file
COPY Recipesuggest/pom.xml .

# Copy the Maven wrapper so we can build
COPY Recipesuggest/.mvn ./.mvn
COPY Recipesuggest/mvnw .

# Download dependencies first to leverage Docker's cache
RUN mvn dependency:go-offline

# Copy the rest of the source code
COPY Recipesuggest/src ./src

# Build the application, creating the JAR file. Skip tests to speed up.
RUN mvn package -DskipTests


# Stage 2: The Runner - This is the final, lightweight container
FROM openjdk:17-slim

# Set the working directory for the final application
WORKDIR /app

# --- Environment Variables ---
ENV OPENAI_API_KEY="your_default_key_here"

# Copy the compiled JAR file from the builder stage into this final container
COPY --from=builder /build/target/Recipesuggest-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# The command to run the application
ENTRYPOINT ["java","-jar","app.jar"]

