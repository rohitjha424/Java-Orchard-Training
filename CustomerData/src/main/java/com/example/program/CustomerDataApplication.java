package com.example.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataApplication.class, args);
	}

}










/* If Port 8080 already in use and Web server fails to start then follow this:
 * 
 *  Open cmd 
 *  
 *  		netstat -ano | findstr :8080
 *  
 * 			taskkill /PID <PID> /F
 */