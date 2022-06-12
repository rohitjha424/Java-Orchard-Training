package com.example.program;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.program.entity.Customer;
import com.example.program.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	private List<Customer> customers = new ArrayList<>(Arrays.asList(
			new Customer(1,"aditya", 10000),
			new Customer(2,"rohit", 20000),
			new Customer(3,"ankit", 30000),
			new Customer(4,"akshay", 40000)
			));
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomer(Integer id) {	
//		return customerRepository.getById(id);
		return customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}
	
	public void addCustomer(String customer) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper om = new ObjectMapper();
		Customer result =  om.readValue(customer, Customer.class); //id,salary,name
		System.out.println(result);
		
		customerRepository.saveAndFlush(result); 
		
		customers.add(result);
	}
	public void deleteCustomer(Integer id) {
		customers.removeIf(c -> c.getId().equals(id));
	}

	
}
