class A
{
	int x = 10;
	
	void show()
	{
		int y = 10;
	}
}


class Q01_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		System.out.println( a.x );
		System.out.println( a.y );
		
		
	}
}

/* 
error: cannot find symbol
	System.out.println( a.y );
                         ^

-----------------------------
 */