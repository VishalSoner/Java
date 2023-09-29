abstract class A
{
	void show()
	{
		System.out.println("Abstract Show");
	}
}

class Q44_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/*

		
error: A is abstract; cannot be instantiated
                A a = new A();
                      ^

--------------------------------------------------------------------------------------
*/







