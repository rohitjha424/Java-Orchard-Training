package com.example.program;

import java.util.*;



import org.springframework.beans.factory.annotation.*;

 
import org.springframework.web.bind.annotation.*;

import com.example.program.entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
	@RestController
	public class CustomerController {
	 
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/Customers")
	public List<Customer> getAllCustomers(){
	 return customerService.getAllCustomers();
	}
	
	@RequestMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
	
//	@RequestMapping(method=RequestMethod.POST, value="/Customers")
	@PostMapping(value="/customers",consumes="application/json")
	public String addCustomer(@RequestBody String customer) throws JsonMappingException, JsonProcessingException{
		customerService.addCustomer(customer);
		return "Added Successfully";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Customers/{id}")	
	public String deleteCustomer(@PathVariable Integer id){
		customerService.deleteCustomer(id);
		return "Deleted Successfully";
	}
	
}
