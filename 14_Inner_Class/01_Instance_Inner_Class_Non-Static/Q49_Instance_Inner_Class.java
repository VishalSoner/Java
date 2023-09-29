class A
{
	abstract class B
	{
		void show()
		{
			System.out.println("A - Abstract Show");
		}
	}
}

class Q49_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.B b = a.new B();
	}
}

/*

		
error: A.B is abstract; cannot be instantiated
                A.B b = a.new B();
                          ^
--------------------------------------------------------------------------------------
*/







