# Spring Boot MySQL REST API (Postman Tested)

## 🚀 Tech Stack
- Spring Boot
- Spring Data JPA
- MySQL
- Postman

## 📌 API Endpoint

GET /api/product

Example:
http://localhost:4241/api/product

## 🗄 Database Table

```sql
CREATE TABLE postmandb (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);
