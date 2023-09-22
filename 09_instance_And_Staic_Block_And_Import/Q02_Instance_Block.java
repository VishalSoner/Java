class A
{
	// instance block
	{	
		System.out.println("Instance block");
	}
	A()
	{
		System.out.println("A Constructor");
	}
}

class Q02_Instance_Block
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
	}
}
 
/* 
Output :- 
Instance block
A Constructor

Instance block
A Constructor

------------------------------------------------
*/




