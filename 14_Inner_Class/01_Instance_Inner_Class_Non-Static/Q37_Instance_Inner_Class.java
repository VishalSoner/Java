/* 
	1. We can't create Static Block in Instance Inner Class.
	2. But We can create Instance Block in Instance Inner Class.
 */

class A
{
	static
	{
		System.out.println("A - Static Block");
	}
	class B 
	{
		static
		{
			System.out.println("B - Static Block");
		}
	}
}


class Q37_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.B b = a.new B();
	}
}

/*

error: Illegal static declaration in inner class A.B
                static
                ^

--------------------------------------------------------------------------------------
*/







