/*
	
	Reference Variable Compile Time par check hota he.
	Object Rum Time par check hota he.
	
*/

class A
{
}

class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}

class Q06_Method_OverLoading
{
	public static void main(String args[])
	{
		// 01
		// A a = new A();
		// a.show();

		// 02
		B b = new B();
		b.show();
		
		// 03
		// A a1 = new B();
		// a1.show();
		
	}
}

/* 
Output :- 

// 01
error: cannot find symbol
	a.show();
     ^


// 02
Class B


// 03
error: cannot find symbol
	a1.show();
	  ^

--------------------------------------------------------------------------------------------- 
*/




