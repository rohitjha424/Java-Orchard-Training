package com.orchard;

public class SwapTwoNumbers {
	
	public static void main(String[] args){
		
		int a =5 ,  b = 3;
		
		SwapTwoNumbers obj = new SwapTwoNumbers();
		System.out.println("a: " + a + " b: "+  b);
		
		obj.SwapNumbers(a,b);
		
		
		
	}
	
	void SwapNumbers(int a , int b) {
		
		int temp;
		
		temp = b;
		b= a;
		a = temp;
		System.out.println("a: " + a + " b: "+  b);
	}

}
