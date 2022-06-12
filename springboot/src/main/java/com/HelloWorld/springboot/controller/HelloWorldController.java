package com.HelloWorld.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String printHelloWorld() {
		
		
		return "Hello World";
	}

}
