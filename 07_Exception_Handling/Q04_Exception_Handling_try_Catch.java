class Q04_Exception_Handling_try_Catch
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		try
		{
			System.out.println("Output : " + x/y );
		}
		
		catch( ArithmeticException e)
		{
			System.out.println( "ArithmeticException Catch Block" );
		}
		catch( NumberFormatException e)
		{
			System.out.println( "NumberFormatException Catch Block" );
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println( "ArrayIndexOutOfBoundsException Catch Block" );
		}
	}
}

/* 

Case - 1 
Input : 100  20
Output : 5


Case - 2
Input : 100  0
ArithmeticException Catch Block


Case - 3
Input : 100  abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "ab"


Case - 4
Input : 100
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
--------------------------------------------------------------------------------------------- 
*/




