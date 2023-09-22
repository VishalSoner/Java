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

class Q07_Static_Block
{
	static 
	{
		System.out.println("Main Method Static Block");
	}
	
	public static void main(String args[])
	{
	}
}
 
/* 
Output :- 
Main Method Static Block
Class A Static Block
A Show Method

------------------------------------------------
*/




