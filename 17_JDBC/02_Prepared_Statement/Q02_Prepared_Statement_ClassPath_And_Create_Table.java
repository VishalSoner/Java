import java.sql.*;

class Q02_Prepared_Statement_ClassPath_And_Create_Table
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
			String create_Table = "CREATE TABLE Prepared_Table( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
			PreparedStatement pr = con.prepareStatement(create_Table);
			
			// 04
			pr.executeUpdate();
			
			// 05
			con.close();
			System.out.println("Table Created Succesfully");
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
Table Created Succesfully
----------------------------------------------------------------------------
*/



