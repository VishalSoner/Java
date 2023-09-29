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


class Q34_Instance_Inner_Class
{
	public static void main( String args[])
	{
		new A().new B().show();
	}
}

/*

show Method

--------------------------------------------------------------------------------------
*/







