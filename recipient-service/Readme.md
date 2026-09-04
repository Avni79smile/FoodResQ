# FoodResQ - Recipient Service

## Purpose

The Recipient Service manages organizations or individuals who require food donations.

It provides CRUD operations for recipient information and supports food requirement details.

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

8083

## API Endpoints

### Get All Recipients

**GET**

`/recipients`

### Get Recipient by ID

**GET**

`/recipients/{id}`

### Create Recipient

**POST**

`/recipients`

### Update Recipient

**PUT**

`/recipients/{id}`

### Delete Recipient

**DELETE**

`/recipients/{id}`

## Swagger API Documentation

http://localhost:8083/swagger-ui.html

## Database

The Recipient Service uses MySQL with Spring Data JPA and Hibernate.

## Service Discovery

The Recipient Service registers with the Eureka Service Registry.

Eureka Server:

http://localhost:8761

## Role in FoodResQ

The Recipient Service manages food recipients and their food requirements so that available donations can be directed to organizations or individuals in need.