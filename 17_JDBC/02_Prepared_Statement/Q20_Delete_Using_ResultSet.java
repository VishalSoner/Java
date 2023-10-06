import java.sql.*;
import java.util.*;

class Q20_Delete_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Delete Row : ");
		int delete_Row = sc.nextInt();

		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			String delete1 = "SELECT * FROM ResultSet_Table";
			PreparedStatement pr = con.prepareStatement( delete1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);	
			// PreparedStatement pr = con.prepareStatement( delete1);

			// 04
			ResultSet rs = pr.executeQuery();
			
			// 01 Reach To Last ( Create a blank row in ResultSet)
			// rs.moveToInsertRow(); 
			rs.absolute( delete_Row );
			
			rs.deleteRow();
			
			System.out.println("Query OK, 1  rows affected.");
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
without ResultSet Categerious
PreparedStatement pr = con.prepareStatement( delete1);
com.mysql.cj.jdbc.exceptions.NotUpdatable: Result Set not updatable.


With ResultSet Categerious
PreparedStatement pr = con.prepareStatement( delete1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
Enter Delete Row : 6
Query OK, 1  rows affected.
----------------------------------------------------------------------------
*/



