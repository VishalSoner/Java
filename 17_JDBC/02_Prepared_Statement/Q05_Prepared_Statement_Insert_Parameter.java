
import java.sql.*;
import java.util.*;

class Q05_Prepared_Statement_Insert_Parameter
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		
		System.out.print("Enter Name : ");
		String name = sc.next();
		
		System.out.print("Enter Contact : ");
		int contact = sc.nextInt();
		
		System.out.print("Enter Address : ");
		String address = sc.next();
		
		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			String insert1 = "Insert into Prepared_Table values(?, ?, ?, ?); ";
			PreparedStatement pr1 = con.prepareStatement(insert1);
			
			// 04
			pr1.setInt(1, id);
			pr1.setString(2, name);
			pr1.setInt(3, contact);
			pr1.setString(4, address);
			
			int rows = pr1.executeUpdate();
			System.out.println("Query OK, " + rows + " rows affected.");
			
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
Enter Id : 6
Enter Name : Faruk
Enter Contact : 798782
Enter Address : Harda

Query OK, 1 rows affected.

mysql> select * from prepared_Table;
+------+--------+---------+---------+
| id   | Name   | Contact | Address |
+------+--------+---------+---------+
|    1 | Aman   | 9876543 | Harda   |
|    1 | Aman   | 9876543 | Harda   |
|    2 | Bhanu  | 7894563 | Harda   |
|    3 | Chandu | 4569871 | Harda   |
|    4 | Deepak | 1234568 | Harda   |
|    5 | Eshan  | 1478523 | Harda   |
|    6 | Faruk  |  798782 | Harda   |
+------+--------+---------+---------+
----------------------------------------------------------------------------
*/



