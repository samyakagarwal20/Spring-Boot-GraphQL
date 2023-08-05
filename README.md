# Spring-Boot-GraphQL
It is a sample spring boot application which demonstrates the working of GraphQL with Spring Boot.

### Prequisites for running the application:

---
Please make sure to have an active instance of MySQL DB running on your system before starting the application.

In case, if you don't have MySQL installed on your system then you could also simply run a container from the mysql image (taken from DockerHub) using the following command:

```docker run --name mysqldb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql```

Once the container is in running state (which you could verify either using docker desktop app or using the command ```docker ps```), you can make use of MySQL Workbench to validate the connection with your running container on port **3306**.

The password specified for mysql DB **root** acoount is **password** :)

---
Once we are done with validating the connection, we need to create the target database as pracDB (the name of the database which I am using in my application).

We can do it either by using MySQL Workbench or by executing the following command in console

```docker exec -it mysqldb mysql -u root -p```

This command prompts for the root password which we specified at the time of running the container. After entering the correct credentials, we get the access to the mysql client where we can execute the SQL query as ```create database pracDB```

We could also create the database with some other name but make sure to change the **spring.datasource.url** property accordingly in application.yaml file.

---
In this method, we have explicitly defined a datasource and a corresponding JdbcTemplate object to perform the setup by referring to the properties defined in the application.yaml file.

The configuration are done within the file J**DBCConfig.java**

---

Before running the application, please locate the **BOOKS-AND-AUTHOR.sql** file present in the root directory and execute the command either on your mysql client ar directly onto the MySQL workbench (the steps for accessing which are already present above)

---
## Enabling GraphQL Playground

For GraphQL playground, we have already added the required dependency in pom.xml file. To further enable it we added the following properties in the application.yaml file 

```
graphql:
  playground:    
    enabled: true
```

Post that, we can simply run the application and access the playground directly by hitting http://localhost:8080/playground on the browser.

---
## Exception Handling with GraphQL

By default, if any exception occurs in the graphql related resolvers or services, etc., then instead of showin our custom error messages, it displays **"Internal Server Error while executing the query"**. This is because of the default exception handler provided by GraphQL itself.

To avoid it, we can enable our custom exception handlers using the ```graphql.servlet.exception-handlers-enabled: true``` in ```application.yaml``` file

Once, we enable the custom excpetion handling, **we need to define our custom exception handlers** too which we can perform using ```@ExceptionHandler``` annotation.

Now, we also need to **handle any other form of exception as well which might occur unexpectedly or else we would end up exposing the critical details to the end-user**. For this, we will add another handler method in the same class annotated with @ExceptionHandler which will account for any ```RuntimeException``` in the application with the message **"Internal Server Error"**.




