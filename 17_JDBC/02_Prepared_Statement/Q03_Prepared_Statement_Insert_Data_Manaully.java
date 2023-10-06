import java.sql.*;

class Q03_Prepared_Statement_Insert_Data_Manaully
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
			String insert = "Insert into Prepared_Table Values (1, 'Aman', 9876543, 'Harda');";
			PreparedStatement pr = con.prepareStatement(insert);
			
			// 04
			int rows = pr.executeUpdate();
			
			// 05
			con.close();
			System.out.println("Query OK, " + rows + " rows affected.");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
Query OK, 1 rows affected.
----------------------------------------------------------------------------
*/



