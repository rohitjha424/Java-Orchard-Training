package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("@@@ Spring Started");
	}

}




















/* If Port 8080 already in use and lWeb server fails to start then follow this:
 * 
 *  Open cmd 
 *  
 *  		netstat -ano | findstr :8080
 *  
 * 			taskkill /PID <PID> /F
 */
