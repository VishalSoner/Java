class Q05_Exception_Handling_Finally_Block
{
	public static void main(String args[])
	{
		System.out.println("Open");
		try
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println(x + "  " + y);
			System.out.println("Ans : " + x/y );
		}
		
		finally
		{
			System.out.println("Finally Block");
		
		}
		System.out.println("Close");
	}
}

/* 

Case - 1 
Input  : 100  20

Output : 
Open
Ans : 5
Finally Block
Close


.........

Case - 2
Input  : 100 0

Output : 
Open
Finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero




Case - 3 
Input  : 100 ab

Output : 
Open
Finally Block
Exception in thread "main" java.lang.NumberFormatException: For input string: "ab"

--------------------------------------------------------------------------------------------- 
*/




