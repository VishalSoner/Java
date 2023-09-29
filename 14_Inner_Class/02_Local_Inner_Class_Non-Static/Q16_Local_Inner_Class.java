/* class ko static method ke andr bhi define kar sakte he. */

class A
{
	static int y = 20;
	
	static void show()
	{
		class B
		{
			void show2()
			{
				System.out.println("Y : " + y);
			}
		}
		B b = new B();
		b.show2();
		System.out.println("AA");
	}
}

class Q16_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Y : 20
AA

-----------------------------
*/
 
 
 
 
 
 
 
 
 