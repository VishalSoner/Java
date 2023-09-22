// static block execute when is  Class Loadind

class A
{
	// instance block
	{
		System.out.println("Instance block - 1");			 
	}
	static void show()
	{
		System.out.println("A Show Method");
	}
}

class Q06_Static_Block
{
	static 
	{
		System.out.println("Main Method Static Block");
	}
	
	public static void main(String args[])
	{
		A.show();
	}
}
 
/* 
Output :- 
Main Method Static Block
A Show Method

------------------------------------------------
*/




