class A
{
	class B
	{
		void show()
		{
			System.out.println("Show Method");
		}
	}
}


class Q35_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A.B b = new A().new B();
		
		b.show();
	}
}

/*

show Method

--------------------------------------------------------------------------------------
*/







