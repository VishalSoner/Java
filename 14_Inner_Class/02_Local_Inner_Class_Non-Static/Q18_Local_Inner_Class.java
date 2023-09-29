/*

Local Class ke andr se change kare to Error aayega (Error). 

*/

class A
{
	void show()
	{
		int y = 201;
		class B
		{
			void show2()
			{
				y = 1000;
				System.out.println("Y : " + y);
			}
		}
		B b = new B();
		b.show2();
		System.out.println("AA");
	}
}

class Q18_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
error: local variables referenced from an inner class must be final or effectively final
	y = 1000;
    ^



Method ke andar variable by default final hota he.
we can't modify final variable.

-----------------------------
*/
 
 
 
 
 
 
 
 
 