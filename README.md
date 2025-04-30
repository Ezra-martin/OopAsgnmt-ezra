# Project Overview

This repository contains three systems implemented in Java for the OOP Assignment:
#### 🎯Land management systems : 
Purpose: This system is designed to manage land-related data, including ownership details, land size, registration dates, and zoning compliance.
#### 🎯Mission management system:
Purpose: A system to manage and track missions within an organization, ensuring that resources are allocated efficiently and progress is monitored.
#### 🎯Nursery management system:
Purpose: This system helps manage the daily operations of a nursery, including tracking plants, inventory, and customer orders.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Docker installed on your system

## Setup Instructions

### Running the Project with Docker
1. **Build the Docker Image**:

   ```bash
   docker build -t 26688-Manzi-Ezra-java .
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it 26688-Manzi-ezra-java
   ```

#### Option 1: Build and Run Locally

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd Land-Management-System
   javac Main.java
   java Main
   ```
#### Option 2: Use Docker Registry

1. **Pull the Prebuilt Docker Image**:

   ```bash
   docker pull  Ezra-martin/26688-Manzi-Ezra-java
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it Ezra-martin/26688-Manzi-Ezra-java
   ```

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd Land-Management-system
   javac Main.java
   java Main
   ```

### Running Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/Ezra-martin/Manzi-Ezra-java.git 
   ```

2. Navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd Mission-Management-System
   javac Main.java
   java Main
   ```
