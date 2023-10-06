import java.sql.*;
import java.util.*;

class Q07_Prepared_Statement_Delete_With_Parameter
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Id Which Do you want to Delete : ");
		int delete_Row = sc.nextInt();
		
		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			String delete = "Delete from Prepared_Table WHERE id = ?";
			PreparedStatement pr1 = con.prepareStatement( delete );
			
			// 04
			pr1.setInt(1, delete_Row);
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
Enter Id Which Do you want to Delete : 100

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
|  100 | ABCD   | 8521478 | Harda   |
+------+--------+---------+---------+




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
+------+--------+---------+---------+

----------------------------------------------------------------------------
*/



