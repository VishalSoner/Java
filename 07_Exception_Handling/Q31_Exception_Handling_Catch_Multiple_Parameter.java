class Q31_Exception_Handling_Catch_Multiple_Parameter
{
	public static void main(String args[])
	{
		try
		{
			int x = Integer.parseInt( args[0] );
			int y = Integer.parseInt( args[1] );
			
			
			System.out.println("X/Y : " + (x/y));
		}
		catch( ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception Occur - 1");
		}
		
		catch( ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception Occur - 2");
		}
	}
}

/*

 error: exception ArithmeticException has already been caught
                catch( ArithmeticException e)
                ^


---------------------------------------------------------------------------------------------
*/




