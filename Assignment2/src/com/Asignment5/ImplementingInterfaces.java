//Assignment 5

/*
 * 
 Create an interface and class implement that interface and display the results.
 
 
 */


package com.Asignment5;

public class ImplementingInterfaces implements Printable {
	
	public void print() {
		System.out.println("Hey There");
	}
		
	public static void main(String[] args) {
			
	ImplementingInterfaces d1 = new ImplementingInterfaces();
			d1.print();
	}
}


