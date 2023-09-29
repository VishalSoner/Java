/* class ko Constructor ke andr bhi define kar sakte he. */

class A
{
	A()
	{
		class B
		{
			void show2()
			{
				System.out.println("A - Constructor Show - 2");
			}
		}
		B b = new B();
		b.show2();
	}
}

class Q09_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/* 

A - Constructor Show - 2



-----------------------------
 */
 
 
 
 
 
 
 
 
 