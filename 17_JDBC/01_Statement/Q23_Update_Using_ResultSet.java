import java.sql.*;
import java.util.*;

class Q23_Update_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);

		System.out.print("Enter Update Row : ");
		int update_Row = sc.nextInt();

		System.out.print("Enter Id Row : ");
		int id = sc.nextInt();

		System.out.print("Enter Name Row : ");
		String name = sc.next();

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
			String update = "SELECT * From ResultSet_Table";
			ResultSet rs = st.executeQuery(update);

			// Reach To Absolute Row Which we wants to update.
			rs.absolute( update_Row );

			rs.updateInt(1, id);
			rs.updateString(2, name);

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

Enter Update Row : 1

Enter Id Row : 123
Enter Name Row : 123




mysql> select * from ResultSet_Table;
+----+------+
| Id | Name |
+----+------+
|  1 | AAA  |
|  2 | BBB  |
|  3 | CCC  |
|  4 | DDD  |
+----+------+
4 rows in set (0.00 sec)

mysql> select * from ResultSet_Table;
+-----+------+
| Id  | Name |
+-----+------+
|   2 | BBB  |
|   3 | CCC  |
|   4 | DDD  |
| 123 | 123  |
+-----+------+
----------------------------------------------------------------------------
*/



