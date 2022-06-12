//Assignment 8

/*
 * 
 Write a java program add the elements using iterator display the all elements .
 elements should not be repeated and elements should store in the random order. 
 Use a suitable collection interface and class.
 
 */

package com.Assignment8;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
	 public static void main(String[] args) {  
	    	
	        HashSet<String> set=new HashSet<String>();  
	        
	        set.add("Rohit");    
	        set.add("Neha");    
	        set.add("Shivani");    
	        set.add("Aditya"); 
	        set.add("Priyanka"); 
	        set.add("Nandita");
	        set.add("Naira"); 
	        set.add("Arjun"); 
	        
	        Iterator<String> itr=set.iterator();    
	        while(itr.hasNext()){    
	           System.out.println(itr.next());    
	        }    
	    }  

}
