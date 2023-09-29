class A
{
	A()
	{
		System.out.println("Class A");
	}
	void show()
	{
		System.out.println("Show Class A");
	}	
}

class Q06_Constructor
{
	public static void main(String args[])
	{
		A a = new A();
		a.A();
	}
}

/* 

error: cannot find symbol
a.A();
				
--------------------------------------------------------------------------------------------- 
*/




