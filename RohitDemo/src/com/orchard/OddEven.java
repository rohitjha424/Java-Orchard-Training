package com.orchard;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OddEven obj = new OddEven();
		
		
		int num;
		 System.out.println("Enter the number: ");
		 num = sc.nextInt();
		  obj.oddEven(num);
	} 
	
	
	void oddEven(int num){
		 
		 if(num%2 ==0) {
			 System.out.println("Even");
		 }
		 else {
			 System.out.println("Odd");
		 }
	 }
	

}
