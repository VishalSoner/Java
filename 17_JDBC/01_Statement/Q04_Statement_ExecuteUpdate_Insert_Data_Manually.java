import java.sql.*;

class Q04_Statement_ExecuteUpdate_Insert_Data_Manually
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
			
			// 04		id, Name, Contact, Address.
			String insert = "Insert into Statement_Table_1 values (1, 'Aman', 9876543, 'Harda');";
			int rows = st.executeUpdate(insert);
			
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





