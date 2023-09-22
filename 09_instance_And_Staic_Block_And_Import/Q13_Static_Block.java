class A
{
	// instance block
	{
		System.out.println("Instance block - 1");			 
	}

	{
		System.out.println("Instance block - 2");
	}
	
	static
	{
		System.out.println("Class A Static Block - 1");
	}	
	static
	{
		System.out.println("Class A Static Block - 2");
	}
	
	A()
	{
		System.out.println("Class A Constructor");
	}
	
	static void show()
	{
		System.out.println("A Show Method");
	}
}

class Q13_Static_Block
{
	static 
	{
		System.out.println("Main Method Static Block - 1");
	}

	static 
	{
		System.out.println("Main Method Static Block - 2");
	}
	
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}
 
/* 
Output :-
 
Main Method Static Block - 1
Main Method Static Block - 2
Class A Static Block - 1
Class A Static Block - 2
Instance block - 1
Instance block - 2
Class A Constructor
A Show Method

------------------------------------------------
*/




