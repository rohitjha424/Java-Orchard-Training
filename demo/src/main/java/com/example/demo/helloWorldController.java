package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	
	@RequestMapping("/hello")
	
	public String helloWorld() {
		return "Hello World ";
	}

}
