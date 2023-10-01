/* 
	1. Super Class ka referance variable sub-class ke object ko store kar sakta he.

	2. Abstract class ka Object nai bana sakte he,
	3. But Abstract class ka referance create kar sakte he. 

*/
abstract class A 
{
	void show()
	{
		System.out.println("Vishal Soner - 1");
	}
}

class B extends A
{}


class Q03_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new B();
		a.show();
	}
}

/* 

Vishal Soner - 1


1. We create Class B.
2. Class B extends A (inherit).
3. Create Object Class B.
4. B Class ke Object ko Super Class A ka referance variable a hold kar raha he.


-----------------------------------------------------------------------------------------------
*/




