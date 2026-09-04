# FoodResQ - Auth Service

## Purpose

The Auth Service manages user registration and login for the FoodResQ platform.

It stores user information using Spring Data JPA, Hibernate, and MySQL.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Spring Cloud Eureka
- Swagger / OpenAPI

## Port

8081

## API Endpoints

### Register User

**POST**

`/auth/register`

### Login User

**POST**

`/auth/login`

## Swagger API Documentation

http://localhost:8081/swagger-ui.html

## Database

The Auth Service uses MySQL with Spring Data JPA and Hibernate.

## Service Discovery

The Auth Service registers with the Eureka Service Registry.

Eureka Server:

http://localhost:8761

## Role in FoodResQ

The Auth Service provides authentication functionality for FoodResQ users and supports different user roles such as donors and recipients.