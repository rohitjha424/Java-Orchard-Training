// Assignment 2


/* Question 2:
 
	Write a simple program which accepts value for the variable 'Rating' use control statements 
	which should have the conditions like -if rating is less print 'Bad rating',
	else 'Good rating or 'Average rating   */


import java.util.Scanner;


public class Rating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaring a rating variable
		
		int rating ;
	
		//Taking Rating Input from the user
		
			System.out.println("Enter the Rating Value (0-10) : ");
			rating = sc.nextInt();
			
			
		//Checking whether rating value entered by the user is in rating limits(0-10)	
			
			
			if(rating > 10 || rating < 0 )
			{
				System.out.println("Wrong Value!!! Please Enter Rating value from 0 to 10 only");
				
			}
			
			
			
			else 
			{
				
				if(rating >=0 && rating <=5)						 //Bad Rating
				{
				
				System.out.println("Bad Rating");
				
				}
			
				else if(rating >5 && rating <=7) 					// Average Rating
				{
				
					System.out.println("Avaerage Rating");
				}
				
				else {    											//Good Rating
				
					System.out.println("Good Rating"); 
				
				}
			
			}
		
				

	}     // End of main 

}
