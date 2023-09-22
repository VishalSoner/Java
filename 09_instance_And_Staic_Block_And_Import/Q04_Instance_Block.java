// Ek class me ek se jyade instance block bana ke ready kar sakte he.

class A
{
	// instance block - 1
	{			System.out.println("Instance block - 1");			 }
	
	// instance block - 2
	{			System.out.println("Instance block - 2");			 }
	
	A()
	{
		System.out.println("A Constructor");
	}
	
	A(int x)
	{
		System.out.println("A Constructor With Parameter");
	}
}

class Q04_Instance_Block
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A(10);
	}
}
 
/* 
Output :- 
Instance block - 1
Instance block - 2
A Constructor
Instance block - 1
Instance block - 2
A Constructor With Parameter

------------------------------------------------
*/




