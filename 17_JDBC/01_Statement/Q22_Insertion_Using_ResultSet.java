import java.sql.*;
import java.util.*;

class Q22_Insert_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
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
			
			
			// 01 Reach To Last ( Create a blank row in ResultSet)
			rs.moveToInsertRow(); 
			
			
			// 02 Update Data in newly Inserted Row
			rs.updateInt(1, id);
			rs.updateString(2, name);
			
			
			// 03 To save the newly inserted Row in Database.
			rs.insertRow();
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

Enter Id Row : 5
Enter Name Row : ASDF



mysql> select * from ResultSet_Table;
+----+------+
| Id | Name |
+----+------+
|  1 | AAA  |
|  2 | BBB  |
|  3 | CCC  |
|  4 | DDD  |
+----+------+


mysql> select * from ResultSet_Table;
+-----+--------+
| Id  | Name   |
+-----+--------+
|   1 | AAA    |
|   2 | BBB    |
|   3 | CCC    |
|   4 | DDD    |
|   5 | ASDF   |
+-----+--------+
----------------------------------------------------------------------------
*/



