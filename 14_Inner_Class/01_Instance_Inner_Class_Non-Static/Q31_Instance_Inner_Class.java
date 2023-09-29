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
	
	{
		System.out.println("Instance Block");
	}
	
	static
	{
		System.out.println("Static Block");
	}
}


class Q31_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
		a.show1();
	}
}

/* 

Static Block
Instance Block
Constructor
Show1 Method
Show1 Method
 
--------------------------------------------------------------------------------------
*/







