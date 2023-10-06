import java.sql.*;

class Q02_Statement_try_Catch
{
	public static void main(String args[])
	{
		try
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
			st.executeUpdate(s1);
			
			// 05
			con.close();
			System.out.println("Class Path Added");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*

Before Class Path :
	java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver


Because there no Class Path Added.
Set Class Path  :  D:\2_All_Code\17_JDBC\mysql-connector-java-8.0.29.jar;.;%classpath%


After Set Class Path :
	Class Path Added
	
	
	
String s1 = "";
	java.sql.SQLException: Can not issue empty query.
----------------------------------------------------------------------------
*/





