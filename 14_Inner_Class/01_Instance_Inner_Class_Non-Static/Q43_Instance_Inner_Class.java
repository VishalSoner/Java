class A
{
	class B
	{
		B()
		{
			System.out.println("B - Constructor");
		}
	}
	class C extends B
	{
		C()
		{
			System.out.println("C - Constructor");
		}
	}
}


class Q43_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.C c = a.new C();
	}
}

/*

		
B - Constructor
C - Constructor

--------------------------------------------------------------------------------------
*/







