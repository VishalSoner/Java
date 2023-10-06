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





