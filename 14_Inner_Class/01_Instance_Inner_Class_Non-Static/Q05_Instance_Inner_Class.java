class Q05_Instance_Inner_Class
{
	int x = 10;

	public static void main( String args[])
	{
		System.out.println("Vishal Soner");
		System.out.println("X : " + x);
	}
}

/* 

error: non-static variable x cannot be referenced from a static context
                System.out.println("X : " + x);
                                            ^
--------------------------------------------------------------------------------------
*/
