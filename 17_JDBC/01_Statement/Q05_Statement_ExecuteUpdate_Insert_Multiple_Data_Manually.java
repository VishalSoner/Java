import java.sql.*;

class Q05_Statement_ExecuteUpdate_Insert_Multiple_Data_Manually
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
			Statement st = con.createStatement();
			
			// 04													id, Name, Contact, Address.
			String insert1 = "Insert into Statement_Table_1 values (2, 'Bhanu', 7894563, 'Harda');";
			String insert2 = "Insert into Statement_Table_1 values (3, 'Chandu', 4569871, 'Harda');";
			String insert3 = "Insert into Statement_Table_1 values (4, 'Deepak', 1234568, 'Harda');";
			String insert4 = "Insert into Statement_Table_1 values (5, 'Eshan', 1478523, 'Harda');";
			
			int rows = st.executeUpdate(insert1);
			rows += st.executeUpdate(insert2);
			rows += st.executeUpdate(insert3);
			rows += st.executeUpdate(insert4);
			
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



In Database.
mysql> SELECT * FROM Statement_Table_1;
+------+--------+---------+---------+
| id   | Name   | Contact | Address |
+------+--------+---------+---------+
|    1 | Aman   | 9876543 | Harda   |
|    2 | Bhanu  | 7894563 | Harda   |
|    3 | Chandu | 4569871 | Harda   |
|    4 | Deepak | 1234568 | Harda   |
|    5 | Eshan  | 1478523 | Harda   |
+------+--------+---------+---------+
----------------------------------------------------------------------------
*/





