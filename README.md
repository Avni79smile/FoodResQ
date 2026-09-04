# FoodResQ — Complete Backend Starter

Java 21 + Spring Boot + MySQL + Eureka + API Gateway + OpenFeign.

Ports:
8761 Eureka | 8080 Gateway | 8081 Auth | 8082 Donor | 8083 Recipient |
8084 Donation | 8085 Matching | 8086 Logistics | 8087 Notification

## Fast setup
1. Install Java 21, Maven, MySQL 8.
2. Run `setup-databases.sql`.
3. In every service `application.properties`, change `YOUR_MYSQL_PASSWORD`.
4. From this folder run:
   `mvn clean package`
5. Start Eureka first, then the other services, then Gateway.
6. Open http://localhost:8761

Each service has its own database. Matching uses OpenFeign + Eureka and ranks recipients.
