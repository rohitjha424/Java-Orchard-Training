import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import com.student.manage.Student;
import com.student.manage.StudentDao;


public class Start {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student Management App");
		
		while(true) {
			
			System.out.println("PRESS 1 to ADD Student");
			System.out.println("PRESS 2 to DELETE Student");
			System.out.println("PRESS 1 to Display Student");
			System.out.println("PRESS 4 to Exit the App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c ==1) {
				
				// add Students
				System.out.println("Enter User Name:");
				String name = br.readLine();
				
				System.out.println("Enter User Phone Number: ");
				String phone = br.readLine();
				
				System.out.println("Enter User City");
				String city = br.readLine();
				
				//Crate Student object to Store Student
				
				Student st = new Student(name, phone, city);
				
				boolean answer = StudentDao.insertStudentToDB(st);
				
				if(answer) {
					System.out.println("Student added successfully");
				} else{
					System.out.println("OOPs!!! Something went Wromg !!!   Try Again");
				}
				
				
				System.out.println(st);
				
				
			}
			else if(c ==2) {
				
				// delete
			}
			else if(c==3) {
				
				// Display
			}
			else if(c==4){
				//Exit
				
				break;
			}
			
			else {
				
			}
		}
		
		System.out.println("Thank your for using the App.");
		
		

	}

}
