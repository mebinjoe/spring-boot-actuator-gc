# spring-boot-actuator-gc
Spring Actuator 2.x and JVM Garbage collection in Spring Boot with Actuator

**Running Examples**

1.Download the zip or clone the Git repository.

2.Unzip the zip file (if you downloaded one)

3.Open Command Prompt and Change directory (cd) to folder containing pom.xml

4.Open in IDE -> Navigate to the folder where you unzipped the zip

5.Select the project(Maven pom.xml)

6.Choose the Spring Boot Application file (search for @SpringBootApplication)

7.Right Click on the file and Run as Java Application

You are all Set

**Below is a list of predefined endpoints in 2.x Actuator:**

`auditevents`: Exposes audit events information for the current application.

`beans`: Displays a complete list of all the Spring beans in your application.

`conditions`: Shows the conditions that were evaluated on configuration and auto-configuration classes and the reasons why they did or did not match.

`configprops`: Displays a collated list of all @ConfigurationProperties.

`env`: Exposes properties from Spring’s ConfigurableEnvironment.

`flyway`: Shows any Flyway database migrations that have been applied.

`health`: Shows application health information.

`httptrace`: Displays HTTP trace information (by default, the last 100 HTTP request-response exchanges).

`info`: Displays arbitrary application info.

`loggers`: Shows and modifies the configuration of loggers in the application.

`liquibase`: Shows any Liquibase database migrations that have been applied.

`metrics`: Shows metrics information for the current application.

`mappings`: Displays a collated list of all @RequestMapping paths.

`scheduledtasks`: Displays the scheduled tasks in your application.

`sessions`: Allows retrieval and deletion of user sessions from a Spring Session-backed session store. Not available when using Spring Session’s support for reactive web applications.

`shutdown`: Lets the application be gracefully shutdown. It's the only endpoint that's not enable by default.

`threaddump`: Performs a thread dump.

_Custom Endpoint:_

`/actuator/users` : returns the predefined user collection
 