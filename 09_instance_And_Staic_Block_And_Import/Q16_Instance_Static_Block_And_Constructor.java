class A
{
	{
		System.out.println("A Instance Block");
	}
	
	static
	{
		System.out.println("A Static Block");
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
	
	static
	{
		System.out.println("B Static Block");
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
	
	static
	{
		System.out.println("C Static Block");
	}
	
	C()
	{
		System.out.println("C Constructor");
	}
}

class Q16_Instance_Static_Block_And_Constructor
{
	public static void main(String args[])
	{
		C c = new C();
	}
}
 
/* 
Output :-
 
A Static Block
B Static Block
C Static Block
A Instance Block
A Constructor
B Instance Block
B Constructor
C Instance Block
C Constructor
------------------------------------------------
*/




