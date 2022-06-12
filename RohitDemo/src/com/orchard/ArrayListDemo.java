package com.orchard;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo {

	public static void main(String[] args) {

		
		ArrayList<String> myName = new ArrayList<>();  
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<5;i++) {
			
			String str = sc.nextLine(); 
			
			
			myName.add(str);
			
		}
		
		
		for(int i =0; i<5;i++) {
			
			System.out.println(myName.get(i));
			
		}
		
		
		

	}

}
