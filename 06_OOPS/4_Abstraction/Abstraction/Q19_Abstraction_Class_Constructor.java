abstract class A
{
	A()
	{
		System.out.println("Abstract Class Constructor");
	}
}

class B extends A
{}

class Q19_Abstraction_Class_Constructor
{
	public static void main(String args[])
	{
		B b = new B();
		
		System.out.println("Done");
	}
}

/* 

Abstract Class Constructor
Done
------------------------------------------------------------------------------------------ 
*/





