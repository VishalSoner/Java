import java.sql.*;
import java.util.*;

class Q06_Prepared_Statement_Update_Data_Parameter
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Id Which Do you want to Update : ");
		int update_Row = sc.nextInt();
		
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
			String update1 = "Update Prepared_Table Set id=?, name=?, contact=?, Address=?	WHERE id = ?";
			PreparedStatement pr1 = con.prepareStatement( update1 );
			
			// 04
			pr1.setInt(1, id);
			pr1.setString(2, name);
			pr1.setInt(3, contact);
			pr1.setString(4, address);
			
			pr1.setInt(5, update_Row);
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
Enter Id Which Do you want to Update : 6
Enter Id : 100
Enter Name : ABCD
Enter Contact : 8521478
Enter Address : Harda
Query OK, 1 rows affected.



Before
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
7 rows in set (0.00 sec)



After
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
|  100 | ABCD   | 8521478 | Harda   |
+------+--------+---------+---------+
----------------------------------------------------------------------------
*/



