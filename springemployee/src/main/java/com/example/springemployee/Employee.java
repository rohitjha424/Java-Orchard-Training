package com.example.springemployee;

public class Employee {
	
	private int id;
	private String Name;
	private int Salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String Name , int Salary) {
		super();
		this.id =id ;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	
	

}
