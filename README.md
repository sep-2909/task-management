# Task Management System

A simple **Task Management System** built with **Spring Boot** to help manage and track tasks effectively. This application allows users to create, update, view, and delete tasks. It supports basic CRUD operations for tasks and is built with the following features:

- **Spring Boot** for application development
- **JPA** (Java Persistence API) for interacting with the database
- **H2 Database** for easy setup and testing
- Layered architecture using **Controller**, **Service**, and **Repository**

## Table of Contents
1. [Features](#features)
2. [Tech Stack](#tech-stack)
3. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
4. [API Endpoints](#api-endpoints)
5. [Running the Application](#running-the-application)
6. [Contributing](#contributing)

## Features
- **Add new tasks**: Create a task with title, description, status, and due date.
- **View all tasks**: List all available tasks, optionally filtering by status.
- **Update a task**: Edit the details of a task including its status.
- **Delete a task**: Remove a task from the system.
- **Search and filter**: Search tasks by id.
- **In-memory H2 database** for quick setup and testing.

## Tech Stack
- **Java 11/17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database**
- **Maven** for dependency management

## Getting Started

### Prerequisites
- JDK 11 or higher
- Maven 3.x
- An IDE (IntelliJ IDEA, Eclipse, etc.)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sep-2909/task-management.git
   cd task-management-system
2. **Build the project**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    The app will be accessible at http://localhost:8080.

## API Endpoints

| Method | Endpoint        | Description               |
|--------|-----------------|---------------------------|
| GET    | /tasks           | Fetch all tasks           |
| GET    | /tasks/{id}      | Fetch a specific task     |
| POST   | /tasks           | Create a new task         |
| PUT    | /tasks/{id}      | Update a task             |
| DELETE | /tasks/{id}      | Delete a task             |

## Running the Application

By default, the app uses an **H2 in-memory database**. You can access the H2 Console for debugging at [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

**JPA and H2** setup are already configured for ease of testing.

To use a different database (e.g., MySQL), update the `application.properties` file with the corresponding JDBC connection details:

### Example for MySQL setup
```properties
#### Application name
spring.application.name=task-management

#### H2 Database Configuration
spring.datasource.url=jdbc:h2:./data/mydatabase;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE
spring.datasource.username=sa
spring.datasource.password=password
spring.datasource.driver-class-name=org.h2.Driver

#### JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

#### H2 Console Configuration
spring.h2.console.enabled=true
spring.h2.console.path=/h2-consoleate
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request, or open an Issue for any feature requests or bugs.

