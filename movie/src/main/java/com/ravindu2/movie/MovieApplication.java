package com.ravindu2.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main class for the Movie application.It serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication  // Marks this class as a Spring Boot application and enables auto-configuration
@RestController  // Indicates that this class will serve RESTful web services
public class MovieApplication {

    /**
     * Main method that serves as the entry point for the Spring Boot application.It launches the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);  // Starts the Spring Boot application
    }

    // Other potential REST endpoints can be added here
}
