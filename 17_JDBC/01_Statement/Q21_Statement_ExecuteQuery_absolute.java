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





