class A
{
	{
		System.out.println("A Instance Block");
	}
	A()
	{
		System.out.println("A Constructor");
	}
}
class B extends A
{
	{
		System.out.println("B Instance Block");
	}
	B()
	{
		System.out.println("B Constructor");
	}
}
class C extends B
{
	{
		System.out.println("C Instance Block");
	}
	C()
	{
		System.out.println("C Constructor");
	}
}

class Q15_Instance_Block_And_Constructor
{
	public static void main(String args[])
	{
		C c = new C();
	}
}
 
/* 
Output :-

A Instance Block
A Constructor
B Instance Block
B Constructor
C Instance Block
C Constructor
------------------------------------------------
*/




