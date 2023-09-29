class A
{
	class B
	{
		class C 
		{
			void show1()
			{
				System.out.println("Show Method - 1");
			}
		}
	}
}


class Q17_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		
		
		c.show1();
	}
}

/* 
 
Show Method - 1
--------------------------------------------------------------------------------------
*/







