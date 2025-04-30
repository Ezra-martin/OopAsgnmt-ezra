## 🖊️Author: MANZI EZRA
  ## ID:26688




# 📦 Java OOP Project Bundle

This repository contains three Object-Oriented Programming (OOP) projects developed in Java. Each system is built around real-world use cases and demonstrates key OOP principles such as **abstraction**, **inheritance**, **encapsulation**, and **polymorphism**.

---

## 📁 Projects Included

### 1. 🌍 Land Management System
- **Description**: Manages land records including ownership details, location, size, and usage.
- **Key Features**:
  - Abstract `Land` class with subclasses (e.g., Residential, Agricultural)
  - Validates ownership details
  - Calculates tax and checks zoning compliance
- **OOP Concepts**: Abstract classes, inheritance, method overriding

📂 Location: `LandManagementSystem/src/`

---

### 2. 🚀 Mission Management System
- **Description**: Tracks and manages different types of missions such as space or military operations.
- **Key Features**:
  - Abstract `Mission` class with concrete mission types
  - Collects input using `Scanner`
  - Supports mission validation and reporting
- **OOP Concepts**: Abstract classes, encapsulation, polymorphism

📂 Location: `MissionManagementSystem/src/`

---

### 3. 🏫 Nursery Management System
-**Description**: A system designed to manage a nursery school, handling student records, class assignments, and attendance.
-**Key Features**:

  -Base Person or Student class with subclasses for specific roles (e.g., Teacher, Guardian)
  -Tracks student enrollment and class schedules
  -Manages attendance and progress reports

OOP Concepts: Inheritance, encapsulation, modular class design

📂 Location: NurseryManagementSystem/src/



---
## 📚 Requirements
Java JDK 8 or higher

  -Basic knowledge of Object-Oriented Programming
  -IDE (optional): IntelliJ, VS Code with Java Extension

## 🚀 How to Run

> All projects are written in Java (JDK 8 or higher) and can be compiled and run from the terminal or any IDE like IntelliJ IDEA or Eclipse.

### 🔧 Compile & Run from Terminal:
```bash
# Example for Land Management System
cd LandManagementSystem/src
javac *.java
java Main

### Running the Project with Docker

#### Option 1: Build and Run Locally

1. **Build the Docker Image**:

   ```bash
   docker build -t 26688-Manzi-Ezra-java
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it 26688-Manzi-Ezra-java
   ```

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd Mission-Management-System
   javac Main.java
   java Main
   ```

#### Option 2: Use Docker Registry

1. **Pull the Prebuilt Docker Image**:

   ```bash
   docker pull Ezra-martin/26688-Manzi-Ezra-java
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it Ezra-martin/26688-Manzi-Ezra-java
   ```

3. **Navigate and Execute**:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   ```bash
   cd Land-Management-System
   javac Main.java
   java Main
   ```




