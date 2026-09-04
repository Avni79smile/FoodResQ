# FoodResQ - Donation Service

## Purpose

The Donation Service manages food donations created by donors.

It stores information such as food name, category, quantity, unit, expiry time, pickup information, and donation status.

The service also communicates with the Donor Service using Spring Cloud OpenFeign.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Spring Cloud Eureka
- Spring Cloud OpenFeign
- Swagger / OpenAPI

## Port

8084

## API Endpoints

### Get All Donations

**GET**

`/donations`

### Get Donation by ID

**GET**

`/donations/id/{id}`

### Create Donation

**POST**

`/donations`

### Update Donation

**PUT**

`/donations/{id}`

### Delete Donation

**DELETE**

`/donations/{id}`

### Get Donor Information

**GET**

`/donations/donor/{id}`

This endpoint demonstrates communication between the Donation Service and Donor Service using OpenFeign.

## Swagger API Documentation

http://localhost:8084/swagger-ui.html

## Database

The Donation Service uses MySQL with Spring Data JPA and Hibernate.

## Microservice Communication

The Donation Service communicates with the Donor Service using Spring Cloud OpenFeign and Eureka Service Discovery.

## Service Discovery

The Donation Service registers with the Eureka Service Registry.

Eureka Server:

http://localhost:8761

## Role in FoodResQ

The Donation Service manages food donations and connects donation information with donor information.