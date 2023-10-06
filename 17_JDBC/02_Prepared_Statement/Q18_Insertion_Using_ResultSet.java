
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



