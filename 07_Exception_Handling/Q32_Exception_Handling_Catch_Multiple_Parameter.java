class Q32_Exception_Handling_Catch_Multiple_Parameter
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
		
		catch( Exception e)
		{
			System.out.println("Exception Occur");
		}
	}
}

/*

Case - 1
Input  :  100 20
Output :  5


Case - 2
Input  :  100 abcd
Output :  Exception Occur

Case - 3
Input  :  100 0
Output :  Exception Occur

---------------------------------------------------------------------------------------------
*/




