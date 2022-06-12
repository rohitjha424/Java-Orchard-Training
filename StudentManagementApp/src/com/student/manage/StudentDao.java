package com.student.manage;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class StudentDao {


	
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		
		
		//jdbc code...
		
		
		try {
			
			Connection con = CP.createC();
			
			String q = "insert into student(sname, sphone , scity ) values(?, ?, ?)";
			
			//PreperaedStatement
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameters
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			
			//Execute
			
			pstmt.executeUpdate();
			
			f= true;
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return f;
		
		
		
	}
	

}