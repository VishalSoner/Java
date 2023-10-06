import java.sql.*;
import java.util.*;

class Q07_Statemen_ExecuteUpdatet_Update_Data_By_User
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
			Statement st = con.createStatement();
			
			// 04													id, Name, Contact, Address.
			String update1 = "Update Statement_Table_1 Set id ='"+id+"' , name = '"+name+"' , contact = '"+contact+"' , address = '"+address+"' WHERE id = '"+update_Row+"'";
			
			int rows = st.executeUpdate( update1 );
			
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
Enter Id Which Do you want to Update : 7
Enter Id : 100
Enter Name : Vishal
Enter Contact : 798782
Enter Address : Harda

Query OK, 1 rows affected.


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
|    7 | Gopal  |  987412 | Harda   |
+------+--------+---------+---------+



After : 
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
|  100 | Vishal |  798782 | Harda   |
+------+--------+---------+---------+
----------------------------------------------------------------------------
*/





