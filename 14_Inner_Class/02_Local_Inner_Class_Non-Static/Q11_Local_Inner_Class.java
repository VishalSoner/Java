/* class ko Static Block ke andr bhi define kar sakte he. */

class A
{
	static
	{		// Static Block
		class B
		{
			void show2()
			{
				System.out.println("B Static Block Show - 2");
			}
		}
		B b = new B();
		b.show2();
	}
}

class Q11_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/* 

B Static Block Show - 2



-----------------------------
*/
 
 
 
 
 
 
 
 
 