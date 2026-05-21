# Wells Fargo Task 2

A Spring Boot REST API for managing a financial advisor data model, including advisors, clients, portfolios, securities, transactions, risk profiles, and portfolio performance reports.

## Overview

This project extends the Wells Fargo Forage task 2 starter application into a more complete backend service. It uses Spring Boot, Spring Data JPA, and an in-memory H2 database to model advisor-client portfolio relationships and expose CRUD endpoints for core portfolio operations.

The application now supports:
- Advisor, client, portfolio, and security entity management.
- Transaction tracking.
- Client risk profiling.
- Portfolio performance reporting.
- REST endpoints for creating, reading, updating, and deleting records.

## Technologies

- Java 21
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Maven

## Features

- Advisor to client relationship management.
- Portfolio and security storage.
- Transaction tracking for portfolio activity.
- Risk profile records for clients.
- Portfolio performance report records.
- REST API endpoints for CRUD operations.
- Relational entity mappings using JPA annotations.

## Running the project
Make sure to have Java 21 installed on your device. I used VS Code for this project, but you may use any IDE of your choice. Run the Spring Boot application from `com.wellsfargo.counselor.Entrypoint`. Then, use Postman, curl, or the VS Code REST Client to call the API endpoints on `http://localhost:8080`.

## Example endpoints

- `GET /api/transactions`
- `POST /api/transactions`
- `GET /api/risk-profiles`
- `POST /api/risk-profiles`
- `GET /api/performance-reports`
- `POST /api/performance-reports`
