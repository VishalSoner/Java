class Q39_Exception_Handling_JavcTPoint_Question
{
	static void A_Method()
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.println("Finally");
		}
	}
	
	public static void main(String args[])
	{
		A_Method();
	}
}

/*

error: unreported exception Exception; must be caught or declared to be thrown
                    throw new Exception();
                    ^
---------------------------------------------------------------------------------------------
*/




