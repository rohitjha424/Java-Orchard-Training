import java.util.Scanner;

public class InterfacesDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x; 
		double y;
		System.out.println("Enter Length of Rectangle:");
		x = sc.nextDouble();
		System.out.println("Enter Breadth of Rectangle:");
		y = sc.nextDouble();
	   
          
        area a = new Rect();    // Object of Rect class into interfaces references
  
       
        System.out.println("\nArea of Rectangle is : " +a.calc(x,y));    
		
		

	}

}

 class Rect implements area    
 {  
	   @Override
    public double calc(double x,double y)    
      {    
          return(x*y);    
       }    
 }    
  

