class Q35_Exception_Handling_toString
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
			System.out.println(e.toString() );
		}
		
	}
}

/*

Case - 1
Input  :  100 20
Output :  5


Case - 2
Input  :  100 abcd
Output :  java.lang.NumberFormatException: For input string: "adcd"

Case - 3
Input  :  100 0
Output :  java.lang.ArithmeticException: / by zero

Case - 4
Input  :  100
Output :  java.lang.ArrayIndexOutOfBoundsException: 0
---------------------------------------------------------------------------------------------
*/




