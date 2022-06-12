// Assignment 2 


/* Question 1:
 
 "Write a program which takes 10 integer inputs from user and store them in an array. 
 Now, copy all the elements in an another array but in reverse order    */

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//Declaring an Array of size 10
		
		int[] arr = new int[10];
		
		System.out.println("Enter the Elements of the Array: ");
		
		//Taking Inputs from the User 
		
		for(int i =0; i<10; i++ ) {
			
			arr[i] = sc.nextInt();
			
		}
		
		//Printing the Array by User
		
		System.out.println("Printing the Array Entered by User: ");
		

		for(int i =0; i<10; i++ ) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		//Declaring a new  Array of size 10.
		
		int[] newArr = new int[10];
		
		int j =0;
		
		//Copying the values in reverse order from 'arr' into 'newArr'
		
		for(int i = newArr.length-1; i >= 0; i-- ) {
			
			
			newArr[i] = arr[j];
			
			j++;
			
		}
		
		System.out.println();
		
		//Printing the New Array which is reverse of the array by the user
		
		System.out.println("Printing the New Array: ");
		

		for(int i =0; i<10; i++ ) {
			
			System.out.print(newArr[i]+" ");
			
		}

	}

}
