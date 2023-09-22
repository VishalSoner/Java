class A
{
	// instance block
	{
		System.out.println("Instance block - 1");			 
	}
	
	static
	{
		System.out.println("Class A Static Block");
	}
	
	static void show()
	{
		System.out.println("A Show Method");
	}
}

class Q09_Static_Block
{
	static 
	{
		System.out.println("Main Method Static Block");
	}
	
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}
 
/* 
Output :-
 
Main Method Static Block
Class A Static Block
Instance block - 1
A Show Method

------------------------------------------------
*/




