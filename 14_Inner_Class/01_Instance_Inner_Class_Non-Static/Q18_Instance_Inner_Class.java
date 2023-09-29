class A
{
	int x = 10;
	static int y = 20;

	class B
	{
		void show1()
		{
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
		}
	}
}


class Q18_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		
		A.B b = a.new B();
		b.show1();
	}
}

/* 
 
X : 10
Y : 20

--------------------------------------------------------------------------------------
*/







