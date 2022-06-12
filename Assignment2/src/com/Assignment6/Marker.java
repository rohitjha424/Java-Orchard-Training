//Assignment 6

// Example for Marker interface


package com.Assignment6;


import java.lang.Cloneable;

class Test implements Cloneable
	{
	    int i;
	    String s;
	  
	    
	    public Test(int i,String s)
	    {
	        this.i = i;
	        this.s = s;
	    }
	  
	    
	    @Override
	    protected Object clone()
	    throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	} 

public class Marker {
	 public static void main(String[] args) 
	    
		        throws CloneNotSupportedException
		    {
		        Test a = new Test(10, "Namaste World");
		  
		    
		        Test b = (Test)a.clone();
		  
		        System.out.println(b.i);
		        System.out.println(b.s);
		    }

}
