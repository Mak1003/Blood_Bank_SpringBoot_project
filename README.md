<!-- PROJECT TITLE & BADGES -->
<h1 align="center">🩸 Blood Bank Management System (Spring Boot Backend)</h1>

<p align="center">
  A robust and scalable RESTful backend application built using <b>Spring Boot</b> and <b>MySQL</b> for efficient blood donation and inventory management.  
  <br>
  <br>
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot">
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql" alt="MySQL">
  <img src="https://img.shields.io/badge/Maven-4.0.0-red?style=for-the-badge&logo=apachemaven" alt="Maven">
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge">
</p>

---

## 🧩 Overview

The **Blood Bank Management System** is a backend service designed to digitalize and streamline blood donation processes, donor management, and blood stock tracking.  
It supports efficient blood request handling, real-time inventory monitoring, and donor data management — enabling integration with web or mobile frontends.

This project follows a **modular MVC architecture** using Controllers, Services, Repositories, and Entities — ensuring clean code separation and easy scalability.

---

## 🌟 Key Features

### 🩺 Donor Management
- Create, update, and delete donor records.
- Track donor history and eligibility.

### 🧫 Blood Inventory Management
- Maintain live inventory by blood group and quantity.
- Auto-update inventory on donation or request approval.

### 🏥 Request Handling
- Manage blood requests from hospitals or individuals.
- Approve or reject requests based on stock availability.

### 🔒 Admin Controls
- Secure endpoints for administrative operations.
- Role-based access control (via Spring Security - optional).

### 🧠 Additional Highlights
- RESTful API with JSON responses.  
- Follows best practices in Spring Boot architecture.  
- Ready for frontend integration (React / Angular / Vue).  
- Configurable and easily deployable on cloud or local server.

---

## ⚙️ Tech Stack

| Category | Technology |
|-----------|-------------|
| **Language** | Java 17 |
| **Framework** | Spring Boot 3.x |
| **Database** | MySQL 8.x |
| **ORM** | Spring Data JPA (Hibernate) |
| **Build Tool** | Maven |
| **Testing** | JUnit / Mockito |
| **Server** | Embedded Tomcat |
| **Version Control** | Git & GitHub |

---

## 🧭 Architecture Overview

Client (Frontend / API Client)
|
>
[Controller Layer] --> Handles REST requests
|
>
[Service Layer] --> Business logic processing
|
>
[Repository Layer] --> Data access (JPA/Hibernate)
|
>
[MySQL Database] --> Persistent storage


---

## 🗂️ Folder Structure

Blood_Bank_SpringBoot_project/
>
├── src/
>
│ ├── main/
>
│ │ ├── java/com/bloodbank/
>
│ │ │ ├── controller/ # REST Controllers
>
│ │ │ ├── service/ # Business Logic
>
│ │ │ ├── repository/ # JPA Repositories
>
│ │ │ ├── entity/ # Entity Classes
>
│ │ │ └── BloodBankApplication.java # Main class
>
│ │ └── resources/
>
│ │ ├── application.properties # Configurations
>
│ │ └── static/, templates/ # (Empty – Backend Only)
>
│ └── test/java/… # Unit Tests
>
│
├── pom.xml # Maven Dependencies
>
└── README.md


---

## 🗄️ Database Configuration

Create your database:
```sql
CREATE DATABASE blood_bank_db;

