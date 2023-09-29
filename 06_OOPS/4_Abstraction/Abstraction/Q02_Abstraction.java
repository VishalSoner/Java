abstract class A
{
	void show()
	{
		System.out.println("Abstract class");
	}
}

class Q02_Abstraction
{
	public static void main(String args[])
	{
		A a = new A();
	}
}

/* 

error: A is abstract; cannot be instantiated
	A a = new A();
		  ^
--------------------------------------------------------------------------------------------- 
*/





