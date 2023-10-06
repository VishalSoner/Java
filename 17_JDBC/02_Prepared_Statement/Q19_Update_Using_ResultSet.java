import java.sql.*;
import java.util.*;

class Q19_Update_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);

		System.out.print("Enter Update Row : ");
		int update_Row = sc.nextInt();

		System.out.print("Enter Id : ");
		int id = sc.nextInt();

		System.out.print("Enter Name : ");
		String name = sc.next();

		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");

			// 03
			String update1 = "SELECT * FROM ResultSet_Table";
			PreparedStatement pr = con.prepareStatement( update1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// PreparedStatement pr = con.prepareStatement( update1);


			// 04
			ResultSet rs = pr.executeQuery();
			
			// 01 Move to Update Row
			rs.absolute( update_Row );

			// 02 Update Data in Row
			rs.updateInt(1, id);
			rs.updateString(2, name);

			// 03 To save the newly inserted Row in Database.
			rs.updateRow();

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
PreparedStatement pr = con.prepareStatement( update1);
com.mysql.cj.jdbc.exceptions.NotUpdatable: Result Set not updatable.


With ResultSet Categerious
PreparedStatement pr = con.prepareStatement( update1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
Enter Update Row : 3
Enter Id : 12
Enter Name : 12
Query OK, 1  rows affected.

----------------------------------------------------------------------------
*/



