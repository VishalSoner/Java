class A
{
	int x = 10;
	
	void show()
	{
		int y = 20;
	}
	void show2()
	{
		System.out.println( x );
		System.out.println( y );
	}
}


class Q02_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show2();
	}
}

/* 

error: cannot find symbol
	System.out.println( y );
						^

-----------------------------
 */
 
 
 
 
 
 
 
 
 