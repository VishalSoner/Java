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



