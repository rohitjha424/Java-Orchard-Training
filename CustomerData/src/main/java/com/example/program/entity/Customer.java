package com.example.program.entity;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	
@Id	
@Column(name="id")	
private Integer id;
@Column(name="name")
private String name;
@Column(name="salary")
private Integer salary;

public Customer() {
}

public Customer(Integer id, String name, Integer amount) {
	super();
	this.id = id;
    this.name= name;
    this.salary = amount;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getsalary() {
	return salary;
}

public void setsalary(Integer salary) {
	this.salary= salary;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", amount=" + salary + "]";
}




}

