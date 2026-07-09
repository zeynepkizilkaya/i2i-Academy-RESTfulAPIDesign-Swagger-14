# RESTful API Design & Swagger - i2i Academy

This is my homework project for i2i Academy. I built a simple REST API for managing customers using Spring Boot, connected to an Oracle database, with Swagger documentation.

## What it does

Basic CRUD operations for a Customer:
- Create a new customer
- Get a customer by id
- Get all customers
- Update a customer
- Delete a customer

## Tech stack

- Java 21
- Spring Boot
- Spring Data JPA
- Oracle Database (running in Docker)
- Swagger / OpenAPI (springdoc-openapi)

## How to run it

1. Start the Oracle database with Docker:

docker run -d --name oracle-xe -p 1521:1521 -e ORACLE_PASSWORD=YourPassword gvenzl/oracle-free:slim

2. Update `application.properties` with your own Oracle password.

3. Run the application from IntelliJ, or with:

mvn spring-boot:run

4. Open Swagger UI in your browser:

http://localhost:8080/swagger-ui.html

## Project structure

- `entity` - Customer entity (maps to the database table)
- `dto` - CustomerDTO, used for API requests/responses
- `repository` - CustomerRepository, database operations
- `service` - CustomerService, business logic
- `controller` - CustomerController, REST endpoints
