class Q37_Exception_Handling_printStackTrace
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
			e.printStackTrace();
		}
		
	}
}

/*

Case - 1
Input  :  100 20
Output :  5


Case - 2
Input  :  100 abcd
Output :  
java.lang.NumberFormatException: For input string: "abcd"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at Q37_Exception_Handling_printStackTrace.main(Q37_Exception_Handling_printStackTrace.java:8)




Case - 3
Input  :  100 0
Output :  
java.lang.ArithmeticException: / by zero
        at Q37_Exception_Handling_printStackTrace.main(Q37_Exception_Handling_printStackTrace.java:11)

Case - 4
Input  :  100
Output :  java.lang.ArrayIndexOutOfBoundsException: 1



---------------------------------------------------------------------------------------------
*/




