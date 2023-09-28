class Q30_Exception_Handling_Catch_Multiple_Parameter
{
	public static void main(String args[])
	{
		try
		{
			int x = Integer.parseInt( args[0] );
			int y = Integer.parseInt( args[1] );
			
			
			System.out.println("X/Y : " + (x/y));
		}
		catch( ArithmeticException | NumberFormatException e)
		{
			System.out.println("Exception Occur");
		}
	}
}

/*

Case - 1
input  : 100 20
Output : 0


Case - 2
input  : 100 0
Output : Exception Occur


Case - 3
input  : 100 abcd
Output : Exception Occur


---------------------------------------------------------------------------------------------
*/




