package com.customer.costomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class AppController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/Customers")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();	


}
	
//	@GetMapping("{id}")
//	public Customer CustomerPathvariable(@PathVariable("id") int id) {
//		
//		return new Customer(id, Name);
//	}
	
}
