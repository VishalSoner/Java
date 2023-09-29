class A
{
	int x = 10;
	static int y = 20;
	static void show()
	{
		class B
		{
			void show2()
			{
				System.out.println("X : " + x);
				System.out.println("Y : " + y);
			}
		}
		B b = new B();
		b.show2();
		System.out.println("AA");
	}
}

class Q15_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: non-static variable x cannot be referenced from a static context
                                System.out.println("X : " + x);
                                                            ^

-----------------------------
*/
 
 
 
 
 
 
 
 
 