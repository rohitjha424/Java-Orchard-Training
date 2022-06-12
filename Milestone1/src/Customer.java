import java.util.*;

import java.io.*; 

class implements Comparable<CustomerData>{
	int id;
	String name;
	double puchaseAmount;
	
	
	CustomerData(int id, String  name, double puchaseAmount ){
		   this.id = id;
		   this.name = name;
		   this.puchaseAmount = puchaseAmount;
		   
	   }
	
	public int compareTo( CustomerData st){  
		if(id==st.id)  
		return 0;  
		else if(id>st.id)  
		return 1;  
		else  
		return -1;  
		}  
	
	
	
	
	
}



public class Customer {

	public static void main(String[] args) {
		
		
		int id;
		String name;
		double puchaseAmount; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Cuustomer data You have to Enter:");
		
		int noOfCustomer = sc.nextInt();
		
		

		 ArrayList<CustomerData> dataList = new ArrayList<CustomerData>();
		 
		 for(int i =1; i <=noOfCustomer;i++) {
			   System.out.println("Enter ID of Customer "+i);
			   id = sc.nextInt();
			   
			   System.out.println("Enter Name of Customer "+i);
			   
			   name = sc.next();
			 
			   System.out.println("Enter Purchase Amount of Customer "+i);
		
			   puchaseAmount = sc.nextDouble();
			
			   
			   dataList.add(new CustomerData(id,name,puchaseAmount)) ;
		   }
		 
		 Collections.sort(dataList);  
		 Iterator itr=dataList.iterator();  
		   //traversing elements of ArrayList object  
		   while(itr.hasNext()){  
			   CustomerData  st=(CustomerData)itr.next();  
		     System.out.println("Customer ID: "+st.id+"\tCustomer Name: "+st.name+"\tPurchase Amount "+st.puchaseAmount);  
		   }  
	}
		 
		/* 
		 System.out.println("Enter the 1: for Displaying all customer records based on their purchaseAmount in descending order");
		 System.out.println("Enter the 2: To Update a particular Customer’s purchasing amount");
		 
		 
		
		 
		 int userCase = sc.nextInt();
		 
		 switch(userCase){    
		    
		    case 1:   
		    	Collections.sort(dataList, Collections.reverseOrder()); 
		    	 System.out.println("\nCostumer Data:\n");
		    	 
		   		 Iterator itr=dataList.iterator();  
		   		   //traversing elements of ArrayList object  
		   		   while(itr.hasNext()){  
		   			   CustomerData  st=(CustomerData)itr.next();  
		   		     System.out.println("Customer ID: "+st.id+"\tCustomer Name: "+st.name+"\tPurchase Amount "+st.puchaseAmount);  
		   		   }  
		   	
		    break;    
		    
		    
		    case 2: 
		    	 System.out.println("Enter the Customer ID for which u which to update Purchage Amount:");
		    	 int idEntered = sc.nextInt();
		    	 
		    	 for(int )
		    	
		    	
		    break;    
		    
		    
		    case 3: ;  
		    break;    
		    
		    
		    case 4: ;  
		    break;        
		    
		    
		    default:System.out.println("Invalid Month!");    
		    }  
		    
		      */
		 
		 
		/* 
		 Iterator itr=dataList.iterator();  
		   //traversing elements of ArrayList object  
		   while(itr.hasNext()){  
			   CustomerData  st=(CustomerData)itr.next();  
		     System.out.println("Customer ID: "+st.id+"\tCustomer Name: "+st.name+"\tPurchase Amount "+st.puchaseAmount);  
		   }  
		
		*/

	}
	
	
	
	
 
}
