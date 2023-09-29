abstract class A
{
	void show()
	{
		System.out.println("A - Abstract Show");
	}
}

class B extends A
{}

class Q45_Instance_Inner_Class
{
	public static void main( String args[])
	{
		B b = new B();
		b.show();
	}
}

/*

		
A - Abstract Show

--------------------------------------------------------------------------------------
*/







