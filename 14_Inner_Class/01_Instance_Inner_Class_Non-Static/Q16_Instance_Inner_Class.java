class A
{
	class B
	{
		void show1()
		{
			System.out.println("Show Method - 1");
		}
	}
}


class Q16_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		A.B b = a.new B();
		
		b.show1();
	}
}

/* 
 
Show Method - 1
--------------------------------------------------------------------------------------
*/







