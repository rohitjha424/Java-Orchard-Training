package com.customer.costomer;

public class Customer {
	
	private int id;
	private String Name;
	 private int PurAmt;
	
	
	public Customer() {
		
	}
	 public Customer(int id, String Name, int PurAmt) {
		 super();
			this.id =id ;
			this.Name = Name;
			 this.PurAmt = PurAmt;
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
	
	public int getPurAmt() {
		return PurAmt;
	}
	public void setPurAmt(int purAmt) {
		PurAmt = purAmt;
	}
	 

}
