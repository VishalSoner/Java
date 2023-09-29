/* class ko Instance Block ke andr bhi define kar sakte he. */

class A
{
	{		// Instance Block
		class B
		{
			void show2()
			{
				System.out.println("B Instance Block Show - 2");
			}
		}
		B b = new B();
		b.show2();
	}
}

class Q10_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/* 

B Instance Block Show - 2



-----------------------------
*/
 
 
 
 
 
 
 
 
 