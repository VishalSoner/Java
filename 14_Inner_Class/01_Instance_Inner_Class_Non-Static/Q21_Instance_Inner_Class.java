class A
{
	private int x = 10;
}


class Q21_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		System.out.println ("X : " + a.x);
	}
}

/* 
 
 error: x has private access in A
                System.out.println ("X : " + a.x);
                                              ^

--------------------------------------------------------------------------------------
*/







