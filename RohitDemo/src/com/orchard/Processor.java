package com.orchard;


import java.util.Arrays;

class Adder{  
	
				static int add(int a,int b){return a+b;}  
				static int add(int a,int b,int c){return a+b+c;}  
}  


class TestOverloading1{  
	
				public static void main(String[] args){  
					Scanner sc = new Scanner(System.in);
				System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
		
}
		
		}  
