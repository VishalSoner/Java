class A
{
	{
		System.out.println("A - Instance Block");
	}
	A()
	{
		System.out.println("A - Constructor");
	}
	
	class B 
	{
		{
			System.out.println("B - Instance Block");
		}
		B()
		{
			System.out.println("B - Constructor");
		}
	}
}


class Q39_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		A.B b = a.new B();
	}
}

/*

		
A - Instance Block
A - Constructor
B - Instance Block
B - Constructor

--------------------------------------------------------------------------------------
*/







