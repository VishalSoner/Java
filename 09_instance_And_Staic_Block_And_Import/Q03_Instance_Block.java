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
	
	A(int x)
	{
		System.out.println("A Constructor With Parameter");
	}
}

class Q03_Instance_Block
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A(10);
	}
}
 
/* 
Output :- 
Instance block
A Constructor

Instance block
A Constructor With Parameter

------------------------------------------------
*/




