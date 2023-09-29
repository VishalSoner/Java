class A
{
	int x = 10;
	void show1()
	{
		System.out.println("X : "  + x);
		B b = new B();
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


class Q13_Instance_Inner_Class
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







