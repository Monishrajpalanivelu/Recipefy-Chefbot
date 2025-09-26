# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory to the container
COPY target/Recipesuggest-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file when the container launches
ENTRYPOINT ["java","-jar","app.jar"]
```

### Step 3: Push This Change to GitHub

Now, you need to save your work and update your GitHub repository.

1.  In your terminal, navigate to the root of your entire project.
2.  Add the new file:
    ```bash
    git add .
    ```
3.  Commit the change:
    ```bash
    git commit -m "Add Dockerfile for Spring Boot backend"
    ```
4.  Push to GitHub:
    ```bash
    git push origin master
    
