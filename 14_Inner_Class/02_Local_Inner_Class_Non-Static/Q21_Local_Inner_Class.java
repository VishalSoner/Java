class A
{
	void show()
	{
		final int y = 201;
		class B
		{
			void show2()
			{
				System.out.println("Y : " + y);
			}
		}
		B b = new B();
		b.show2();
		y = 20;
		System.out.println("Y : " + y);
	}
}

class Q21_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: cannot assign a value to final variable y
                y = 20;
                ^
-----------------------------
*/
 
 
 
 
 
 
 
 
 