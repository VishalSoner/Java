import java.sql.*;

class Q03_Statement_ExecuteUpdate_Create_Table
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
			String s1 = "CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
			int x = st.executeUpdate(s1);
			
			// 05
			con.close();
			
			System.out.println("Table Created.");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
// 01 Run 1st Time.
Table Created.

// 02 Run Again
java.sql.SQLSyntaxErrorException: Table 'statement_table_1' already exists
----------------------------------------------------------------------------
*/





