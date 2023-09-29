class A
{
	void show1()
	{
		System.out.println("A - Show1 Method");
	}
}

class B extends A
{
	void show2()
	{
		System.out.println("B - Show2 Method");
	}
}


class Q40_Instance_Inner_Class
{
	public static void main( String args[])
	{
		B b = new B();
		
		b.show1();
		b.show2();
	}
}

/*

		
A - Show1 Method
B - Show2 Method

--------------------------------------------------------------------------------------
*/







