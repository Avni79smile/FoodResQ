# FoodResQ - Donor Service

## Purpose

The Donor Service manages food donors registered on the FoodResQ platform.

It provides CRUD operations for creating, viewing, updating, and deleting donor information.

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

8082

## API Endpoints

### Get All Donors

**GET**

`/donors`

### Get Donor by ID

**GET**

`/donors/{id}`

### Create Donor

**POST**

`/donors`

### Update Donor

**PUT**

`/donors/{id}`

### Delete Donor

**DELETE**

`/donors/{id}`

## Swagger API Documentation

http://localhost:8082/swagger-ui.html

## Database

The Donor Service uses MySQL with Spring Data JPA and Hibernate.

## Service Discovery

The Donor Service registers with the Eureka Service Registry.

Eureka Server:

http://localhost:8761

## Role in FoodResQ

The Donor Service manages donor profiles and information required for food donation activities.