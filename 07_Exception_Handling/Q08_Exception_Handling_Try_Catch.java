class Q08_Exception_Handling_Try_Catch
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

		System.out.println("Hello");
		
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Close");
	}
}

/* 

error: 'try' without 'catch', 'finally' or resource declarations
                try
                ^
error: 'catch' without 'try'
                catch(Exception e)
--------------------------------------------------------------------------------------------- 
*/




