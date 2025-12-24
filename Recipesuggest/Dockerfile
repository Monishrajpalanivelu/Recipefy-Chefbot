# Stage 1: Builder
FROM eclipse-temurin:17-jdk-jammy AS builder

WORKDIR /build

# Copy pom.xml first (for caching)
COPY Recipesuggest/pom.xml .

# Copy Maven Wrapper
COPY Recipesuggest/.mvn ./.mvn
COPY Recipesuggest/mvnw .

# Make mvnw executable
RUN chmod +x mvnw

# Download dependencies (cache-friendly)
RUN ./mvnw dependency:go-offline

# Copy source code
COPY Recipesuggest/src ./src

# Build jar
RUN ./mvnw package -DskipTests


# Stage 2: Runner
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

ENV OPENAI_API_KEY="your_default_key_here"

COPY --from=builder /build/target/Recipesuggest-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
