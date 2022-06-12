package com.example.springemployee;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			
			new Employee(1, "Rohit", 20000),
			new Employee(2, "Pratiksha", 20000),
			new Employee(3, "Bharti", 20000),
			new Employee(4, "Aditya", 20000),
			new Employee(5, "Pragya", 20000)
			
			
			
			
			));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	


}
