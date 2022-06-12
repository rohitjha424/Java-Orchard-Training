package com.HelloWorld.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HwlloWorldController {
	
	
	@RequestMapping("/hello")
	public String printHelloWold() {
		return "Hello World";
	}

}
