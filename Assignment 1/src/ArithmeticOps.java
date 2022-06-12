// Assignment 1 


/*  Question: 
 
 Write a simple program which accepts 4 values for the variables ,
 use Logical operators to print their results And arithmetic operators for addition subtraction ,
 multiplication and the division with their respective results each on new line.
 
 */

import java.util.Scanner; 

public class ArithmeticOps {

	public static void main(String[] args) {
	
		
Scanner sc = new Scanner(System.in);
		
		
		//declaring 4 variables 
		
		int a;
		int b;
		int c;
		int d;
		
		
		//declaring the results and initializing them with the values.
		
		int sum = 0;
		int diff = 0;
		double product = 0.0;
		double div ;
		
		
		//taking user inputs
		
		System.out.println("Enter 4 Numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt(); 
		c = sc.nextInt(); 
		d = sc.nextInt();

		sum = a+b+c+d;
		
		diff = a-b-c-d;
		
		product = a*b*c*d;
		
		div = a/b/c/d;
		
		System.out.println("The addition of all the numbes is: "+ sum);
		
		System.out.println("The Substraction of all the numbes is: "+ diff);
		
		System.out.println("The Multiplication of all the numbes is: "+ product);
		
		System.out.println("The Divison of all the numbes is: "+ div);
		
		
	}

}
