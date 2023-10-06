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



