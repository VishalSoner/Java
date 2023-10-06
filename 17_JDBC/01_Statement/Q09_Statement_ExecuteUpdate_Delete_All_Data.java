import java.sql.*;
import java.util.*;

class Q09_Statement_ExecuteUpdate_Delete_All_Data
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			Statement st = con.createStatement();
			
			// 04										id, 	Name, 	Contact, 	Address.
			String delete1 = "Delete From Statement_Table_1";
			
			int rows = st.executeUpdate( delete1 );
			
			// 05
			con.close();
			
			System.out.println("Query OK, " + rows + " rows Deleted.");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
Enter Id Which Do you want to Update : 6
Query OK, 5 rows Deleted.




In Database.   Before 
mysql> SELECT * FROM Statement_Table_1;
+------+--------+---------+---------+
| id   | Name   | Contact | Address |
+------+--------+---------+---------+
|    1 | Aman   | 9876543 | Harda   |
|    2 | Bhanu  | 7894563 | Harda   |
|    3 | Chandu | 4569871 | Harda   |
|    4 | Deepak | 1234568 | Harda   |
|    5 | Eshan  | 1478523 | Harda   |
|    6 | Faruk  | 9632145 | Harda   |
+------+--------+---------+---------+


After : 
mysql> SELECT * FROM Statement_Table_1;
Empty set (0.00 sec)

----------------------------------------------------------------------------
*/





