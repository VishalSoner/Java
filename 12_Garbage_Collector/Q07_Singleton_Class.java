class A
{
	private A()
	{
		System.out.println("Constructor");
	}
	
	static A getObject()
	{
		return new A();
	}
	
	void show()
	{
		System.out.println("Show Method");
	}
}

class Q07_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		a1.show();
	}
}
/*
Constructor
Show Method

--------------------------------------------------------
*/


