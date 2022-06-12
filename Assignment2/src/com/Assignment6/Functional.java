//Assignment 6

// Example for Functional interface


package com.Assignment6;


public class Functional {
	
	public static void main(String args[])
    {
      
        new Thread(new Runnable() {
        	
            @Override public void run()
            {
                System.out.println("A New thread");
            }
            
        }).start();
    }

}
