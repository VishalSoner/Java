import java.sql.*;
import java.util.*;

class Q24_delete_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Deleted Row : ");
		int deleted_Row = sc.nextInt();

		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			// 04
			String printData = "SELECT * From ResultSet_Table";
			
			ResultSet rs = st.executeQuery( printData );
			
			// Reach To Delete Row
			rs.absolute( deleted_Row ); 
			System.out.println( rs.getString(1) +",  " + rs.getString(2) );
			
			rs.deleteRow();
			System.out.println("Query OK, 1  rows Deleted.");
			
			// 05
			con.close();
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
Query OK, 1  rows Deleted.
----------------------------------------------------------------------------
*/



