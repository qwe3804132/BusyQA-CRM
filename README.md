# BusyQA-CRM
This project contains BusyQA-CRM front-end and back-end


For **Front-End** configuration please run <br />
```npm install``` <br />
first to install node_module and all other dependent component. <br />
please make sure that your **Port-4200** not occupied by other program.
<br /><br /><br />
For **Back-End** configuration please <br />
**1. Firstly configure your DB schema by importing the script file in the root folder of repo.**<br />
**2. Make sure there are no program running on port - 8080**
**3. Application.properties - Make sure you have meet all requirement and with correct DB username and password and port number**

```server.port=8080
server.servlet.context-path=/BusyQACRMBackEnd

spring.datasource.url = jdbc:mysql://localhost:3306/busyqacrmbackenddb
spring.datasource.username=root
spring.datasource.password=z1324356


spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

crmbackend.app.jwtSecret= PeiranSecretKey
crmbackend.app.jwtExpirationMs= 86400000


debug=false

trace=false  ```
