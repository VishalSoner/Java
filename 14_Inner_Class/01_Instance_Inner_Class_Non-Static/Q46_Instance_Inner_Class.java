abstract class A
{
	class B
	{
		void show()
		{
			System.out.println("A - Abstract Show");
		}
	}
}

class C extends A
{}

class Q46_Instance_Inner_Class
{
	public static void main( String args[])
	{
		C c = new C();
		
		C.B b = c.new B();
		b.show();
	}
}

/*

		
A - Abstract Show

--------------------------------------------------------------------------------------
*/







