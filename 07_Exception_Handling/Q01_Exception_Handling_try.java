class Q01_Exception_Handling_try
{
	public static void main(String args[])
	{
		int x = Integer.parseInt( args[0] );
		int y = Integer.parseInt( args[1] );
		
		try
		{
			System.out.println( x/y );
		}
	}
}

/* 
Output :- 

error: 'try' without 'catch', 'finally' or resource declarations

--------------------------------------------------------------------------------------------- 
*/




