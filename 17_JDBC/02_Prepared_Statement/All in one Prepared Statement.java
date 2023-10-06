/*
1. Create Database JDBC_Demo;
2. Use JDBC_Demo;


The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.


Why use PreparedStatement?
Improves performance: The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.
*/

import java.sql.*;

class Q01_Prepared_Statement_All_Steps
{
	public static void main(String args[])
	{
		// 01
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 02
		String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
		Connection con = DriverManager.getConnection( url, "root", "root");
		
		// 03
		String s1 = "CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
		PreparedStatement pr = con.prepareStatement("CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );");
		
		// 04
		pr.executeUpdate();
		
		// 05
		con.close();
	}
}

/*

error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
    Class.forName("com.mysql.cj.jdbc.Driver");
                 ^
error: unreported exception SQLException; must be caught or declared to be thrown
    Connection con = DriverManager.getConnection( url, "root", "root");
                                                ^
error: unreported exception SQLException; must be caught or declared to be thrown
	PreparedStatement pr = con.prepareStatement("CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );");
												^
error: unreported exception SQLException; must be caught or declared to be thrown
	pr.executeUpdate();
					^

error: unreported exception SQLException; must be caught or declared to be thrown
	con.close();
	         ^
----------------------------------------------------------------------------
*/



import java.sql.*;

class Q02_Prepared_Statement_ClassPath_And_Create_Table
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
			String create_Table = "CREATE TABLE Prepared_Table( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
			PreparedStatement pr = con.prepareStatement(create_Table);
			
			// 04
			pr.executeUpdate();
			
			// 05
			con.close();
			System.out.println("Table Created Succesfully");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
Before Class Path :
	java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver


Because there no Class Path Added.
Set Class Path  :  D:\2_All_Code\17_JDBC\mysql-connector-java-8.0.29.jar;.;%classpath%


After Set Class Path :
Table Created Succesfully
----------------------------------------------------------------------------
*/



import java.sql.*;

class Q03_Prepared_Statement_Insert_Data_Manaully
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
			String insert = "Insert into Prepared_Table Values (1, 'Aman', 9876543, 'Harda');";
			PreparedStatement pr = con.prepareStatement(insert);
			
			// 04
			int rows = pr.executeUpdate();
			
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
Query OK, 1 rows affected.
----------------------------------------------------------------------------
*/



import java.sql.*;

class Q04_Prepared_Statement_Insert_Data_Multiple_Data
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
			String insert1 = "Insert into Prepared_Table values (2, 'Bhanu', 7894563, 'Harda');";
			String insert2 = "Insert into Prepared_Table values (3, 'Chandu', 4569871, 'Harda');";
			String insert3 = "Insert into Prepared_Table values (4, 'Deepak', 1234568, 'Harda');";
			String insert4 = "Insert into Prepared_Table values (5, 'Eshan', 1478523, 'Harda');";
	
			PreparedStatement pr1 = con.prepareStatement(insert1);
			PreparedStatement pr2 = con.prepareStatement(insert2);
			PreparedStatement pr3 = con.prepareStatement(insert3);
			PreparedStatement pr4 = con.prepareStatement(insert4);
			
			// 04
			int rows = pr1.executeUpdate();
			rows += pr2.executeUpdate();
			rows += pr3.executeUpdate();
			rows += pr4.executeUpdate();
			
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

mysql> select * from prepared_Table;
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



import java.sql.*;
import java.util.*;

class Q08_Prepared_Statement_Delete_All_With_Parameter
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
			String delete = "Delete from Prepared_Table";
			PreparedStatement pr1 = con.prepareStatement( delete );
			
			// 04
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
Query OK, 6 rows affected.





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
+------+--------+---------+---------+




After
mysql> select * from prepared_Table;
Empty set (0.00 sec)

----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q09_Prepared_Statement_ResultSet
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
			String display_All = "SELECT * FROM Prepared_Table";
			PreparedStatement pr = con.prepareStatement( display_All );
			
			// 04
			ResultSet rs = pr.executeQuery();
			
			// rs.next();
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			
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
With  :  rs.next();
1 , Aman , 9876543 , Harda


Without  :  rs.next();
java.sql.SQLException: Before start of result set
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q10_Prepared_Statement_getInt_getString
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
			String display_All = "SELECT * FROM Prepared_Table";
			PreparedStatement pr = con.prepareStatement( display_All );
			
			// 04
			ResultSet rs = pr.executeQuery();
			
			rs.next();
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			rs.next();
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			rs.next();
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			rs.next();
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			
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
With  :  rs.next();
1 , Aman , 9876543 , Harda
2 , Bhanu , 7894563 , Harda
3 , Chandu , 4569871 , Harda
4 , Deepak , 1234568 , Harda

Without  :  rs.next();
java.sql.SQLException: Before start of result set
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q11_Prepared_Statement_next
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
			String display_All = "SELECT * FROM Prepared_Table";
			PreparedStatement pr = con.prepareStatement( display_All );
			
			// 04
			ResultSet rs = pr.executeQuery();
			
			while( rs.next() )
			{
				System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );
			}
			
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
With  :  rs.next();
1 , Aman , 9876543 , Harda
2 , Bhanu , 7894563 , Harda
3 , Chandu , 4569871 , Harda
4 , Deepak , 1234568 , Harda
5 , Eshan , 1478523 , Harda

----------------------------------------------------------------------------
*/



/* Previous  And TYPE_FORWARD_ONLY */

import java.sql.*;
import java.util.*;

class Q12_Prepared_Statement_previous_TYPE_FORWARD_ONLY
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
			String display_All = "SELECT * FROM Prepared_Table";
			// PreparedStatement pr = con.prepareStatement( display_All );
			PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			// 04
			ResultSet rs = pr.executeQuery();
			
			while( rs.next() ){}
		
			while( rs.previous() )
				System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );			
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

PreparedStatement pr = con.prepareStatement( display_All );
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.



PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
5 , Eshan , 1478523 , Harda
4 , Deepak , 1234568 , Harda
3 , Chandu , 4569871 , Harda
2 , Bhanu , 7894563 , Harda
1 , Aman , 9876543 , Harda



ResultSet Categories :-

1. TYPE_FORWARD_ONLY     :- Cursor can Moved Only Forward Direction.
2. TYPE_SCROLL_SENSITIVE :- Cursor can Moved Only Forward and Backward Direction. (Both)

3. CONCUR_READ_ONLY 	 :- Only Read the Data From ResultSet ( Getter Method).
4. CONCUR_UPDATEABEL 	 :- it can insert, update, delete, create (All) Using ResultSet.

----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q13_Prepared_Statement_first
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
			String display_All = "SELECT * FROM Prepared_Table";
			// PreparedStatement pr = con.prepareStatement( delete );
			PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			// 04
			ResultSet rs = pr.executeQuery();
			
			while( rs.next() ){}   // Reach To Last
			
			rs.first();  	 // Reach To First
			
			while( rs.next() )
			{
				System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );			
			}
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

PreparedStatement pr = con.prepareStatement( delete );
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.


PreparedStatement pr = con.prepareStatement( delete ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
2 , Bhanu , 7894563 , Harda
3 , Chandu , 4569871 , Harda
4 , Deepak , 1234568 , Harda
5 , Eshan , 1478523 , Harda
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q14_Prepared_Statement_beforeFirst
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
			String display_All = "SELECT * FROM Prepared_Table";
			PreparedStatement pr = con.prepareStatement( display_All );
			// PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			// 04
			ResultSet rs = pr.executeQuery();
			
			while( rs.next() ){}   // Reach To Last
			
			rs.beforeFirst();  	 // Reach To First
			
			while( rs.next() )
			{
				System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );			
			}
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

PreparedStatement pr = con.prepareStatement( display_All );
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.


PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
1 , Aman , 9876543 , Harda
2 , Bhanu , 7894563 , Harda
3 , Chandu , 4569871 , Harda
4 , Deepak , 1234568 , Harda
5 , Eshan , 1478523 , Harda
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q15_Prepared_Statement_last
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
			String display_All = "SELECT * FROM Prepared_Table";
			// PreparedStatement pr = con.prepareStatement( display_All );
			PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			// 04
			ResultSet rs = pr.executeQuery();
			
			rs.last(); // Reach To Last
			
			while( rs.previous() )
			{
				System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );			
			}
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

PreparedStatement pr = con.prepareStatement( display_All );
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.

PreparedStatement pr = con.prepareStatement( display_All ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
4 , Deepak , 1234568 , Harda
3 , Chandu , 4569871 , Harda
2 , Bhanu , 7894563 , Harda
1 , Aman , 9876543 , Harda
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q17_Prepared_Statement_absolute
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		System.out.print("Enter Which row Do you want to Print : ");
		int absolute_Row = sc.nextInt();
			
			
		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			String absolute1	 = "SELECT * FROM Prepared_Table";
			// PreparedStatement pr = con.prepareStatement( absolute1 );
			PreparedStatement pr = con.prepareStatement( absolute1 ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			
			// 04
			ResultSet rs = pr.executeQuery();
			
			rs.absolute(absolute_Row); // Reach To Last
			System.out.println(rs.getString("id") + " , " + rs.getString("Name") + " , " + rs.getString(3) +" , " + rs.getString(4) );			

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

PreparedStatement pr = con.prepareStatement( absolute1 );
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.

PreparedStatement pr = con.prepareStatement( absolute1 ,  ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

// 01
Enter Which row Do you want to Print : 1
1 , Aman , 9876543 , Harda

// 02
Enter Which row Do you want to Print : 5
5 , Eshan , 1478523 , Harda
----------------------------------------------------------------------------
*/




import java.sql.*;
import java.util.*;

class Q18_Insertion_Using_ResultSet
{
	public static void main(String args[])
	{
		Scanner	sc = new Scanner(System.in);
		
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
			String insert1 = "SELECT * FROM ResultSet_Table";
			PreparedStatement pr = con.prepareStatement( insert1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);	
			// PreparedStatement pr = con.prepareStatement( insert1);
			
			
			// 04
			ResultSet rs = pr.executeQuery();
			
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
without ResultSet Categerious 
PreparedStatement pr = con.prepareStatement( insert1);
com.mysql.cj.jdbc.exceptions.NotUpdatable: Result Set not updatable.


With ResultSet Categerious 
PreparedStatement pr = con.prepareStatement( insert1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);	
Enter Id : 6
Enter Name : Vishal
Query OK, 1  rows affected.





Create table ResultSet_Table
(
	Id int(10) Primary Key,
	Name varchar(20)
);



Insert into ResultSet_Table values
(1, 'AAA'),
(2, 'BBB'),
(3, 'CCC'),
(4, 'DDD'),
(5, 'EEE'),
(6, 'FFF'),
(7, 'GGG');

Some Cases when a resultSet can't be updatable

1. If it don't have primary key.
2. if it contains Data From more then one table.
3. if Select Command contains some aggregation function (sum, max, avg, etc... ).

----------------------------------------------------------------------------
*/



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



