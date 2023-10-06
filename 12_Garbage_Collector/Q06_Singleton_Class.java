class A
{
	private A()
	{
		System.out.println("Constructor");
	}
}

class Q06_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = new A();
	}
}
/*
error: A() has private access in A
                A a1 = new A();
                       ^

--------------------------------------------------------
*/


