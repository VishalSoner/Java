class Q34_Exception_Handling_Catch_Multiple_Parameter
{
	public static void main(String args[])
	{
		try
		{
			int x = Integer.parseInt( args[0] );
			int y = Integer.parseInt( args[1] );
			
			
			System.out.println("X/Y : " + (x/y));
		}

		catch( ArithmeticException | Exception e)
		{
			System.out.println("ArithmeticException Exception Occur - 1");
		}
		
	}
}

/*

error: Alternatives in a multi-catch statement cannot be related by subclassing
                catch( ArithmeticException | Exception e)
											 ^
---------------------------------------------------------------------------------------------
*/




