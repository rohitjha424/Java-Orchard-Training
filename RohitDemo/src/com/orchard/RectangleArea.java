package com.orchard;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RectangleArea obj = new RectangleArea();
		
		
		int l;
		int b;
		 System.out.println("Enter the length of rectangle: ");
		 
		 l = sc.nextInt();
		 
		 System.out.println("Enter the breadth of rectangle: ");
		 b = sc.nextInt();
		  
		 
		 
		int result =  obj.area(l,b);
		 
		 System.out.println("Area: "+ result + " Sq. units");
		 

	}
	
	int area(int l, int b) {
		
		int Area = l*b;
		return Area;
	}

}
