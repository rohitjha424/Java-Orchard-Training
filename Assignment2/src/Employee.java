//Assignment 2: 

/*
 Using static variables, static methods, static blocks, create a 
 java program and display the results. Using “this” word get 
 data and display the results.
 
 
 */



public class Employee {
	
	int emp_id;  
	String emp_name;
	    
	 
	    static String dept_name;
	    
	    static {
	    	
	        System.out.println("Employee Dsetails: ");
	        System.out.println();
	    }
	  
	    static int counter = 0;
	  
	    public Employee(String emp_name)
	    {
	        this.emp_name = emp_name;
	   
	        this.emp_id = setId();
	    }
	  
	 
	    static int setId()
	    {
	        counter++;
	        return counter;
	    }
	  
	  
	    static void setDept(String emp_name) { dept_name = emp_name; }
	  
	     
	    void getStudentInfo()
	    {
	        System.out.println("Employee Name : " + this.emp_name);
	        System.out.println("Employee ID : " + this.emp_id);
	        System.out.println("dept_name : " + dept_name);
	        
	        System.out.println();
	        
	        
	    }
	
	    public static void main(String[] args)
	    {
	      
	        Employee.setDept("Web Dev");
	  
	        Employee e1 = new Employee("Rohit");
	        Employee e2 = new Employee("Sneha");
	  
	        e1.getStudentInfo();
	        e2.getStudentInfo();
	        
	        
	    }
	}


