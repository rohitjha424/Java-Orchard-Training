package com.example.springemployee;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	

	
	@Autowired
	private EmployeeServices employeeService;
	
	@RequestMapping("/Employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	

}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
//	@RequestMapping("/emp")
//	public ArrayList<String> getAllUsers()
//	{
//		ArrayList<String> str = new ArrayList<String>();
//	       str.add("Employee 1: Name: Rohit >>> Designnation: Engineer >>> Salary : 26000");
//	       str.add("Employee 2: Name: Supriya >>> Designnation: HR >>> Salary : 50000");
//	       str.add("Employee 3: Name: Bharti >>> Designnation: Software Developer >>> Salary : 80000");
//	       
//	       return str;
//	}
}