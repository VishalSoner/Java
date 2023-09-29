class A
{
	int x = 10;
	static void show1()
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


class Q14_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 
 
error: non-static variable x cannot be referenced from a static context
                System.out.println("X : "  + x);
                                             ^
Q14_Instance_Inner_Class.java:7: error: non-static variable this cannot be referenced from a static context
                B b = new B();
                      ^
 
--------------------------------------------------------------------------------------
*/







