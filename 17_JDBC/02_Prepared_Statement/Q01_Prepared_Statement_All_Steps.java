/*
1. Create Database JDBC_Demo;
2. Use JDBC_Demo;


The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.


Why use PreparedStatement?
Improves performance: The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.
*/

import java.sql.*;

class Q01_Prepared_Statement_All_Steps
{
	public static void main(String args[])
	{
		// 01
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 02
		String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
		Connection con = DriverManager.getConnection( url, "root", "root");
		
		// 03
		String s1 = "CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
		PreparedStatement pr = con.prepareStatement("CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );");
		
		// 04
		pr.executeUpdate();
		
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
	PreparedStatement pr = con.prepareStatement("CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );");
												^
error: unreported exception SQLException; must be caught or declared to be thrown
	pr.executeUpdate();
					^

error: unreported exception SQLException; must be caught or declared to be thrown
	con.close();
	         ^
----------------------------------------------------------------------------
*/



