class A
{
	private int x = 10;
	
	private class B
	{
		void show2()
		{
			System.out.println ("Class B");
			System.out.println ("X : " + x);
		}
	}
	
	void show1()
	{
		B b = new B();
		b.show2();
	}
}


class Q27_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		a.show1();
	}
}

/* 

Class B
X : 10
 
--------------------------------------------------------------------------------------
*/







