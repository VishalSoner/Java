/* 
	1. We can't create Static Block in Instance Inner Class.
	2. But We can create Instance Block in Instance Inner Class.
 */

class A
{
	{
		System.out.println("A - Instance Block");
	}
	class B 
	{
		{
			System.out.println("B - Instance Block");
		}
	}
}


class Q38_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		A.B b = a.new B();
	}
}

/*

		
A - Instance Block
B - Instance Block

--------------------------------------------------------------------------------------
*/







