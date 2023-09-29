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

class B extends A
{}

class Q47_Instance_Inner_Class
{
	public static void main( String args[])
	{
		B b1 = new B();
		
		B.B b2 = b1.new B();
		b2.show();
	}
}

/*

		
A - Abstract Show

--------------------------------------------------------------------------------------
*/







