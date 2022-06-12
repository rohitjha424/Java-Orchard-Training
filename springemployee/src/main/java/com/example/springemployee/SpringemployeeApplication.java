package com.example.springemployee;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringemployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringemployeeApplication.class, args);
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