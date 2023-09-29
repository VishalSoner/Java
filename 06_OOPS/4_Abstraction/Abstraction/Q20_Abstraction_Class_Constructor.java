abstract class A
{
	A()
	{
		System.out.println("Abstract Class Constructor");
	}
	
	void show()
	{
		System.out.println("Abstract Class Show Method");
	}
}

class B extends A
{}

class Q20_Abstraction_Class_Constructor
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
		System.out.println("Done");
	}
}

/* 

Abstract Class Constructor
Abstract Class Show Method
Done
------------------------------------------------------------------------------------------ 
*/





