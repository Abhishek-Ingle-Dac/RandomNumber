# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory content (including Java source file) into the container at /app
COPY . /app

# Compile the Java program
RUN javac number.java

# Run the Java program
CMD ["java", "number"]
