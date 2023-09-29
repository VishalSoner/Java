class A
{
	A()
	{
		System.out.println("Constructor");
	}
	void show1()
	{
		System.out.println("Show1 Method");
	}
}


class Q28_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 

Constructor
Show1 Method
 
--------------------------------------------------------------------------------------
*/







