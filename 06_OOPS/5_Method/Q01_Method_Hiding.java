/*

1.	if a subclass defines a static method with the same signature as a static method in the super class.
2.	In such a case, the method in the subclass hides the one in the superclass.
3.	The mechanism is known as method hiding. 
4.	It happens because static methods are resolved at compile time.

*/
class A
{
	static void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	static void show()
	{
		System.out.println("Class B");
	}
}

class Q01_Method_Hiding
{
	public static void main(String args[])
	{
		// 01
		A a = new A();
		a.show();

		// 02
		B b = new B();
		b.show();
		
		// 03
		A a1 = new B();
		a1.show();
		
	}
}

/* 
Output :- 

// 01
Class A

// 02
Class B

// 03
Class A

--------------------------------------------------------------------------------------------- 
*/




