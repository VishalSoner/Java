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



