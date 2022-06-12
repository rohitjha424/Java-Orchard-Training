

package com.Assignment7;

public class TwoDimensionalArray {
	
	public static void main(String[] args)
    
    {
  
        int[][] arr = new int[5][2];
        
        arr[0][0] = 15;
        arr[0][1] = 16;
        arr[1][0] = 23;
        arr[1][1] = 84;
        arr[2][0] = 35;
        arr[2][1] = 49;
        arr[3][0] = 78;
        arr[3][1] = 63;
        arr[4][0] = 85;
        arr[4][1] = 59;
       
        
        
        System.out.println(" Printing Array Elements:");
        
        System.out.println();
        
        for(int i = 0; i<5;i++) {
        	for(int j =0; j<2; j++) {
        		
        		System.out.print("arr["+i+"]["+j+"] = "+ arr[i][j] + "\t ");
        	}
        	System.out.println();
        }
        
	  	  
    
    }
	

}
