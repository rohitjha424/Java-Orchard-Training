package com.orchard;
import java.util.*;  

class EmployeeDetails 
{
	
	int emp_id, emp_salary;
	 
	   String emp_name;
	   
	   EmployeeDetails(int emp_id,String  emp_name, int emp_salay){
		   this.emp_id = emp_id;
		   this.emp_name = emp_name;
		   this.emp_salary = emp_salary;
		   
	   }
	
}	

 
public class Employee
{
 
  // main method
 
   public static void main(String args[])
   {
	   
	   
	   ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>(); 
	   
	   Scanner sc = new Scanner(System.in);
	   String emp_name;
	   int emp_salary ;
	   int emp_id;
	   
	   
	   for(int i =1; i <=3;i++) {
		   System.out.println("Enter ID of Emplayee "+i);
		   emp_id = sc.nextInt();
		   
		   System.out.println("Name of Emplayee "+i);
		   
		   emp_name = sc.next();
		 
		   System.out.println("salary of Emplayee "+i);
	
		   emp_salary = sc.nextInt();
		
		   
		   al.add(new EmployeeDetails(emp_id,emp_name,emp_salary)) ;
	   }

		   Iterator itr=al.iterator();  
		   //traversing elements of ArrayList object  
		   while(itr.hasNext()){  
			   EmployeeDetails st=(EmployeeDetails)itr.next();  
		     System.out.println("ID: "+st.emp_id+"\tName: "+st.emp_name+"\tSalary "+st.emp_salary);  
		   }  
	   
	   
   }
}
	
