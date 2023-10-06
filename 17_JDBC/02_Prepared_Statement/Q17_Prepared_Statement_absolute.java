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



