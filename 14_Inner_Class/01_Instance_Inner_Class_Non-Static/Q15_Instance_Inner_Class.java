class A
{
	int x = 10;
	static void show1()
	{
		A a = new A();
		System.out.println("X : "  + a.x);
		
		A.B b = a.new B();
		b.show2();
		
	}
	class B
	{
		void show2()
		{
			System.out.println("Show Method - 2");
		}
	}
}


class Q15_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 
 
X : 10
Show Method - 2
--------------------------------------------------------------------------------------
*/







