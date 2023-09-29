class A
{
	class B
	{
		class C
		{
			void show()
			{
				System.out.println("Show Method");
			}
		}
	}
}


class Q36_Instance_Inner_Class
{
	public static void main( String args[])
	{
		new A().new B().new C().show();
	}
}

/*

show Method

--------------------------------------------------------------------------------------
*/







