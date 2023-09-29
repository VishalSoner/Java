class A
{
	int x = 10;
	
	void show()
	{
		class B 
		{
			void show2()
			{
				System.out.println("B - show2");
			}
		}
		
		B b = new B();
		b.show2();
		
		System.out.println( "A - show");
	}
}


class Q04_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

B - show2
A - show

-----------------------------
 */
 
 
 
 
 
 
 
 
 