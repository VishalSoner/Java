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
		System.out.println( "A - show");
	}
}


class Q03_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

A - show


-----------------------------
 */
 
 
 
 
 
 
 
 
 