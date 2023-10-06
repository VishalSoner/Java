import java.sql.*;

class Q04_Prepared_Statement_Insert_Data_Multiple_Data
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
			String insert1 = "Insert into Prepared_Table values (2, 'Bhanu', 7894563, 'Harda');";
			String insert2 = "Insert into Prepared_Table values (3, 'Chandu', 4569871, 'Harda');";
			String insert3 = "Insert into Prepared_Table values (4, 'Deepak', 1234568, 'Harda');";
			String insert4 = "Insert into Prepared_Table values (5, 'Eshan', 1478523, 'Harda');";
	
			PreparedStatement pr1 = con.prepareStatement(insert1);
			PreparedStatement pr2 = con.prepareStatement(insert2);
			PreparedStatement pr3 = con.prepareStatement(insert3);
			PreparedStatement pr4 = con.prepareStatement(insert4);
			
			// 04
			int rows = pr1.executeUpdate();
			rows += pr2.executeUpdate();
			rows += pr3.executeUpdate();
			rows += pr4.executeUpdate();
			
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
Query OK, 4 rows affected.
----------------------------------------------------------------------------
*/



