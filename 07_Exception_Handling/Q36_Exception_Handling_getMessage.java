class Q36_Exception_Handling_getMessage
{
	public static void main(String args[])
	{
		try
		{
			int x = Integer.parseInt( args[0] );
			int y = Integer.parseInt( args[1] );
			
			
			System.out.println("X/Y : " + (x/y));
		}

		catch( Exception e)
		{
			System.out.println(e.getMessage() );
		}
		
	}
}

/*

Case - 1
Input  :  100 20
Output :  5


Case - 2
Input  :  100 abcd
Output :  For input string: "abcd"

Case - 3
Input  :  100 0
Output :  / by zero

Case - 4
Input  :  100
Output :  1





---------------------------------------------------------------------------------------------
*/




