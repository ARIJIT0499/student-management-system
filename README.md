# Student Management System

## Overview

A Spring Boot REST API for managing students, courses, and addresses.

## Features

* Student CRUD Operations
* Course CRUD Operations
* Address Management
* Student-Course Mapping
* Search Students
* Course Search by Topic
* Validation APIs
* Swagger Documentation
* JUnit Testing

## Technologies Used

* Java 17
* Spring Boot 3
* Spring Data JPA
* MySQL
* Maven
* Swagger/OpenAPI
* JUnit 5

## API Endpoints

### Student APIs

* POST /students
* GET /students
* GET /students/{id}
* PUT /students/{id}
* DELETE /students/{id}

### Course APIs

* POST /courses
* GET /courses
* GET /courses/topic?topic=Spring

## Run Project

1. Clone repository
2. Configure MySQL
3. Run:
   mvn spring-boot:run

## Author

Arijit
