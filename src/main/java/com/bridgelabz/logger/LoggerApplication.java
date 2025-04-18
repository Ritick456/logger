package com.bridgelabz.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggerApplication {

	// Using SLF4J Logger
	public static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		// Corrected logger.debug with proper typo fix
		logger.debug("Welcome to Spring Concept Demo");

		// Run Spring Boot Application
		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);

		// Log context bean information
		logger.debug("Checking Context: {}", context.getBean("demoBean")); // Assuming bean name is 'demoBean'

		// Additional logging examples
		logger.debug("\n*** Example Using @Autowired annotation on property ***");
	}
}
