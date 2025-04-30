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

3. 🏫 Nursery Management System
Description: A system designed to manage a nursery school, handling student records, class assignments, and attendance.

Key Features:

Base Person or Student class with subclasses for specific roles (e.g., Teacher, Guardian)

Tracks student enrollment and class schedules

Manages attendance and progress reports

OOP Concepts: Inheritance, encapsulation, modular class design

📂 Location: NurseryManagementSystem/src/



---

## 🚀 How to Run

> All projects are written in Java (JDK 8 or higher) and can be compiled and run from the terminal or any IDE like IntelliJ IDEA or Eclipse.

### 🔧 Compile & Run from Terminal:
```bash
# Example for Land Management System
cd LandManagementSystem/src
javac *.java
java Main
