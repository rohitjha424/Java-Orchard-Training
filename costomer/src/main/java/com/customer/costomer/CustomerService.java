package com.customer.costomer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
private List<Customer> customers = new ArrayList<>(Arrays.asList(
			
			new Customer(1, "Rohit" , 500),
			new Customer(2, "Pratiksha" , 200),
			new Customer(3, "Bharti" , 566),
			new Customer(4, "Aditya", 544),
			new Customer(5, "Pragya", 895)
			
			
		));

public List<Customer> getAllCustomer(){
	return customers;
	
}

}



