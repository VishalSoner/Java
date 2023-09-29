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


class Q11_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		B b = a.new B();
		
		b.show1();
	}
}

/* 
 
error: cannot find symbol
    B b = a.new B();
	^ 
 
--------------------------------------------------------------------------------------
*/







