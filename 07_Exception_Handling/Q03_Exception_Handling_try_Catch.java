import java.util.Scanner;

class Q03_Exception_Handlingclass_try_Catch
{
	public static void main(String args[])
	{
		int x = Integer.parseInt( args[0] );
		int y = Integer.parseInt( args[1] );
		
		catch( Exception we)
		{
			System.out.println( x/y );
		}
	}
}

/* 
Output :- 

: error: 'catch' without 'try'

--------------------------------------------------------------------------------------------- 
*/
