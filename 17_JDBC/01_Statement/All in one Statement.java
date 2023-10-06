/*
1. Create Database JDBC_Demo;
2. Use JDBC_Demo;
*/

import java.sql.*;

class Q01_Statement_All_Steps
{
	public static void main(String args[])
	{
		// 01
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 02
		String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
		Connection con = DriverManager.getConnection( url, "root", "root");
		
		// 03
		Statement st = con.createStatement();
		
		// 04
		String s1 = "";
		st.executeQuery(s1);
		
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
	Statement st = con.createStatement();
                                      ^
									  
error: unreported exception SQLException; must be caught or declared to be thrown
    st.executeQuery(s1);
                   ^
				   
error: unreported exception SQLException; must be caught or declared to be thrown
    con.close();
             ^
----------------------------------------------------------------------------
*/




import java.sql.*;

class Q02_Statement_try_Catch
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
			
			// 04
			String s1 = "";
			st.executeUpdate(s1);
			
			// 05
			con.close();
			System.out.println("Class Path Added");
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
	Class Path Added
----------------------------------------------------------------------------
*/





import java.sql.*;

class Q03_Statement_executeUpdate_Create_Table
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
			
			// 04
			String s1 = "CREATE TABLE Statement_Table_1( id int(10), Name varchar(20), Contact int(15), Address varchar(20) );";
			int x = st.executeUpdate(s1);
			
			// 05
			con.close();
			
			System.out.println("Table Created.");
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
// 01 Run 1st Time.
Table Created.

// 02 Run Again
java.sql.SQLSyntaxErrorException: Table 'statement_table_1' already exists
----------------------------------------------------------------------------
*/





import java.sql.*;

class Q04_Statement_executeUpdate_Insert_Data_Manually
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
			
			// 04		id, Name, Contact, Address.
			String insert = "Insert into Statement_Table_1 values (1, 'Aman', 9876543, 'Harda');";
			int rows = st.executeUpdate(insert);
			
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

class Q05_Statement_executeUpdate_Insert_Multiple_Data_Manually
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





import java.sql.*;
import java.util.*;

class Q06_Statement_executeUpdate_Insert_Data_By_User
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
			Statement st = con.createStatement();
			
			// 04													id, Name, Contact, Address.
			String insert1 = "Insert into Statement_Table_1 values( '"+id+"' , '"+name+"' , '"+contact+"' , '"+address+"'); ";
			
			int rows = st.executeUpdate(insert1);
			
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
Enter Id : 6
Enter Name : Faruk
Enter Contact : 9632145
Enter Address : Harda
Query OK, 1 rows affected.


In Database.
mysql> SELECT * FROM Statement_Table_1;
+------+--------+---------+---------+
| id   | Name   | Contact | Address |
+------+--------+---------+---------+
|  1   | Aman   | 9876543 | Harda   |
|  2   | Bhanu  | 7894563 | Harda   |
|  3   | Chandu | 4569871 | Harda   |
|  4   | Deepak | 1234568 | Harda   |
|  5   | Eshan  | 1478523 | Harda   |
|  6   | Faruk  | 9632145 | Harda   |
+------+--------+---------+---------+

----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q07_Statement_executeUpdate_Update_Data_By_User
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





import java.sql.*;
import java.util.*;

class Q08_Statement_executeUpdate_Delete_Data_By_User
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
			Statement st = con.createStatement();
			
			// 04										id, 	Name, 	Contact, 	Address.
			String delete1 = "Delete From Statement_Table_1 where Id = '"+ delete_Row+"'";
			
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
// 01
Enter Id Which Do you want to Update : 6
Query OK, 1 rows Deleted.

// 02
Enter Id Which Do you want to Delete : 10
Query OK, 0 rows Deleted.



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

class Q09_Statement_executeUpdate_Delete_All_Data
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





import java.sql.*;
import java.util.*;

class Q10_Statement_ExecuteQuery_ResultSet
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			
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
java.sql.SQLException: Before start of result set

----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q11_Statement_ExecuteQuery_ResultSet
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			rs.next();
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			
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
1, Aman, 9876543, Harda
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q12_Statement_ExecuteQuery_ResultSet
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			rs.next();
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			
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
1, Aman, 9876543, Harda
1, Aman, 9876543, Harda
1, Aman, 9876543, Harda
1, Aman, 9876543, Harda
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q13_Statement_ExecuteQuery_next
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			
			System.out.print( rs.next() + "  :  " );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );

			System.out.print( rs.next() + "  :  " );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );

			System.out.print( rs.next() + "  :  " );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );

			System.out.print( rs.next() + "  :  " );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			
			System.out.print( rs.next() + "  :  " );
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			// 05
			System.out.print( rs.next() + "  ResultSet Reach Last Row" );
			con.close();
			
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
	}
}

/*
true  :  1, Aman, 9876543, Harda
true  :  2, Bhanu, 7894563, Harda
true  :  3, Chandu, 4569871, Harda
true  :  4, Deepak, 1234568, Harda
true  :  5, Eshan, 1478523, Harda
false  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q14_Statement_ExecuteQuery_next
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			while( rs.next() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
true  :  1, Aman, 9876543, Harda
true  :  2, Bhanu, 7894563, Harda
true  :  3, Chandu, 4569871, Harda
true  :  4, Deepak, 1234568, Harda
true  :  5, Eshan, 1478523, Harda
false  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q15_Statement_ExecuteQuery_previous
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
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			while( rs.next() )
			{}
		
			while( rs.previous() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q16_Statement_ExecuteQuery_previous_TYPE_FORWARD_ONLY
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
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			while( rs.next() )
			{}
		
			while( rs.previous() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
5, Eshan, 1478523, Harda
4, Deepak, 1234568, Harda
3, Chandu, 4569871, Harda
2, Bhanu, 7894563, Harda
1, Aman, 9876543, Harda
true  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/



import java.sql.*;
import java.util.*;

class Q17_Statement_ExecuteQuery_first
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
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			while( rs.next() )
			{}
		
			rs.first();
			
			while( rs.next() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
2, Bhanu, 7894563, Harda
3, Chandu, 4569871, Harda
4, Deepak, 1234568, Harda
5, Eshan, 1478523, Harda
false  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/










import java.sql.*;
import java.util.*;

class Q18_Statement_ExecuteQuery_beforeFirst
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
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			while( rs.next() ){}
		
			rs.beforeFirst();
			
			while( rs.next() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
1, Aman, 9876543, Harda
2, Bhanu, 7894563, Harda
3, Chandu, 4569871, Harda
4, Deepak, 1234568, Harda
5, Eshan, 1478523, Harda
false  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/








import java.sql.*;
import java.util.*;

class Q19_Statement_ExecuteQuery_last
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
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			rs.last();
			
			while( rs.previous() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
4, Deepak, 1234568, Harda
3, Chandu, 4569871, Harda
2, Bhanu, 7894563, Harda
1, Aman, 9876543, Harda
true  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q20_Statement_ExecuteQuery_AfterLast
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
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			rs.afterLast();
			
			while( rs.previous() )
				System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

			System.out.print( rs.next() + "  ResultSet Reach Last Row" );

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
5, Eshan, 1478523, Harda
4, Deepak, 1234568, Harda
3, Chandu, 4569871, Harda
2, Bhanu, 7894563, Harda
1, Aman, 9876543, Harda
true  ResultSet Reach Last Row
----------------------------------------------------------------------------
*/





import java.sql.*;
import java.util.*;

class Q21_Statement_ExecuteQuery_absolute
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			// 01
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 02
			String url = "jdbc:mysql://localhost:3306/JDBC_Demo";
			Connection con = DriverManager.getConnection( url, "root", "root");
			
			// 03
			Statement st = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY );
			
			// 04
			String printData = "SELECT * From Statement_Table_1";
			
			ResultSet rs = st.executeQuery( printData );
			
			System.out.print("Enter Which row Do you want to Print : ");
			int absolute1 = sc.nextInt();
			
			rs.absolute(absolute1);
			
			System.out.println( rs.getInt(1) + ", " + rs.getString(2)  + ", " + rs.getString(3)  + ", " + rs.getString(4) );
			

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
// 01   
Enter Which row Do you want to Print : 5
5, Eshan, 1478523, Harda


// 02
Enter Which row Do you want to Print : 2
2, Bhanu, 7894563, Harda


----------------------------------------------------------------------------
*/





