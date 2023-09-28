class Q33_Exception_Handling_Catch_Multiple_Parameter
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
			System.out.println("Exception Occur");
		}
		
		catch( ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception Occur - 1");
		}
		
	}
}

/*

error: exception ArithmeticException has already been caught
                catch( ArithmeticException e)
                ^
---------------------------------------------------------------------------------------------
*/




