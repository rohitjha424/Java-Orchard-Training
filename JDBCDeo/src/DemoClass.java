//Java Data base Connectivity 



/*
 * 1. import   ----------------->>> java.sql
 * 2. load and register  ------->>> com.mysql.jdbc.Driver
 * 3. create connection   ----  >>> Connection
 * 4. create a statement  ------>>> Statement
 * 5. create the query
 * 6. process the results
 * 7. close 
 * 
 * 
 */

import java.sql.*;




public class DemoClass {
	
	public static void main(String[] args ) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/student_manage";
		
		String uname = "root";
		String pass = "root123"; 
		
		String query = "select username from students where id =2";
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		
		 ResultSet rs = st.executeQuery(query);
		 
		 rs.next();
		 
		 String name = rs.getString("username");
		 
		 System.out.println(name);
		 st.close();
		 con.close();
		
	}

}
