class A
{
	A()
	{
		System.out.println("Constructor A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Constructor B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Constructor C");
	}
}

class Q05_Inheritance_With_Constructor
{
	public static void main(String args[])
	{
		B b = new B();
	}	
}




/* 
Constructor A
Constructor B
*/
// ------------------------------------------------------------------------------------------------








