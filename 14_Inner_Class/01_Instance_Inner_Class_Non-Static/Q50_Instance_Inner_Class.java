class A
{
	abstract class B
	{
		void show()
		{
			System.out.println("A - B - Abstract Show");
		}
	}
	
	class C extends B 
	{}
}

class Q50_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.C c = a.new C();
		c.show();
		
	}
}

/*

		
A - B - Abstract Show
--------------------------------------------------------------------------------------
*/







