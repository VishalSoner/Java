class A
{
	A()
	{
		System.out.println("A - Constructor");
	}
}
class B extends A
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


class Q42_Instance_Inner_Class
{
	public static void main( String args[])
	{
		C c = new C();
	}
}

/*

		
A - Constructor
B - Constructor
C - Constructor

--------------------------------------------------------------------------------------
*/







