/*
1. Create Database JDBC_Demo;
2. Use JDBC_Demo;
*/

import java.sql.*;

class Q01_Statement_All_Steps
{
	public static void main(String args[])
	{
		// 01
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 02
		String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
		Connection con = DriverManager.getConnection( url, "root", "root");
		
		// 03
		Statement st = con.createStatement();
		
		// 04
		String s1 = "";
		st.executeQuery(s1);
		
		// 05
		con.close();
	}
}

/*

error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
    Class.forName("com.mysql.cj.jdbc.Driver");
                 ^
				 
error: unreported exception SQLException; must be caught or declared to be thrown
    Connection con = DriverManager.getConnection( url, "root", "root");
                                                ^
												
error: unreported exception SQLException; must be caught or declared to be thrown
	Statement st = con.createStatement();
                                      ^
									  
error: unreported exception SQLException; must be caught or declared to be thrown
    st.executeQuery(s1);
                   ^
				   
error: unreported exception SQLException; must be caught or declared to be thrown
    con.close();
             ^
----------------------------------------------------------------------------
*/



