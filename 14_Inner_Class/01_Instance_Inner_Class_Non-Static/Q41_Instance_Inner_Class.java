class A
{
	class B 
	{
		void show1()
		{
			System.out.println("B - Show1 Method");
		}
	}
	class C extends B 
	{
		void show2()
		{
			System.out.println("C - Show2 Method");
		}
	}
}


class Q41_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.C c = a.new C();
		c.show1();
		c.show2();
	}
}

/*

		
B - Show1 Method
C - Show2 Method

--------------------------------------------------------------------------------------
*/







