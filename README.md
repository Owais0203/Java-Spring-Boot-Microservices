Company Microservice
#
Overview

The Company Microservice is a critical component of my system designed to manage information related to companies within my platform. It provides functionalities similar to job and review microservices but focuses on maintaining company-specific data.
##
Features
Company CRUD Operations: Create, read, update, and delete operations for managing company profiles.
Company Information: Store and retrieve details such as company name, description, location, industry, and contact information.
Integration: Seamlessly integrates with other microservices, such as Job and Review microservices, to provide comprehensive company-related functionalities.
Scalability: Built to handle a large volume of company records and requests, ensuring scalability as our platform grows.
#
Dependencies
Database: Utilizes PostgreSQL database for storing company data.
Docker: Postgres docker container is used for database.
#
Endpoints
GET /companies: Retrieve a list of all companies.
GET /companies/{companyId}: Retrieve details of a specific company by ID.
POST /companies: Create a new company profile.
PUT /companies/{companyId}: Update an existing company profile.
DELETE /companies/{companyId}: Delete a company profile by ID.

