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





