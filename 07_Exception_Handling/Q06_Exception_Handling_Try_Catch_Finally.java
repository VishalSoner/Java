class Q06_Exception_Handling_Try_Catch_Finally
{
	public static void main(String args[])
	{
		System.out.println("Open");
		try
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Ans : " + x/y );
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
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
Catch Block
Finally Block
Close



Case - 3 
Input  : 100 ab

Output : 
Open
Catch Block
Finally Block
Close

--------------------------------------------------------------------------------------------- 
*/




