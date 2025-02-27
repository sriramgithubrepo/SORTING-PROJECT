# Sorting Algorithm Project

## Overview

This project implements a custom sorting algorithm that:
- Sorts numbers first (treating consecutive digits as a single number).
- Then sorts lowercase letters, uppercase letters, and special characters.
- Have used Junit for test cases.

## Prerequisites
- Java 8 or later installed and environment variables need to be set. 
- Command Line (Terminal, Command Prompt, or PowerShell).
- Maven 3.X or later installed and environment variables need to be set.
- An IDE (like Eclipse, IntelliJ IDEA, or Visual Studio Code)

## Folder Structure

The workspace contains two main folders , where:

- `src\main\java\com\example`: has the main program for custom sorting
- `src\test\java\com\example`: has the test cases for custom sorting
- `pom.xml`: dependency management

## Steps to run

### 1. Clone the Repository and switch to project location
git clone <git-repo>
cd sorting-project

### 2. Build the Project and Run all Tests
mvn clean install

### 3. To run only specific method with result
On Windows Navigate to the src\main\java
javac .\com\example\StringSort.java
java com.example.StringSort

On Mac Navigate to the /src/main/java
javac com/example/StringSort.java
java com.example.StringSort
