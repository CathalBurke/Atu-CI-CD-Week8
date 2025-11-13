# Week 8 – Docker and PostgreSQL Lab

This project is a Spring Boot application that can run in two ways:
1. Using H2 (local)
2. Using PostgreSQL in Docker

---

## Running the App with H2 (Local)

1. In IntelliJ, set the active profile to **dev**
2. Run the application
3. Open Swagger in your browser:  
   http://localhost:8080/swagger-ui/index.html
4. Use Swagger to add, update, delete and view persons.

---

## Running the App with Docker 

1. Build the project using Maven (this creates the jar file).
2. Make sure a .env file exists (copied from .env.example).
3. Start Docker using docker compose.
4. Open Swagger in your browser:  
   http://localhost:8080/swagger-ui/index.html
5. Add a few persons in Swagger.
6. Stop the Docker containers.
7. Start them again.
8. Open Swagger again and run GET — the same persons should still be there.

---

## Files Included

- Dockerfile
- docker-compose.yml
- .env.example
- application.properties
- application-dev.properties
- application-docker.properties

.env is not included 
