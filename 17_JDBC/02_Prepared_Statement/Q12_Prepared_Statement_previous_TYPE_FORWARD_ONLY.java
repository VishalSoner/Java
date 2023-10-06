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



