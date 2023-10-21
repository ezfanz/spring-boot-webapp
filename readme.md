# Irfan SpringBoot CRUD WebApp

## Step 1: Install Docker and Run MySQL

To set up the MySQL database, follow these steps:

```bash
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword \
--env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos \
--env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle

## Step 2: Configure Application Properties

spring.datasource.url=jdbc:mysql://localhost:3306/todos
spring.datasource.username=todos-user
spring.datasource.password=dummytodos
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

