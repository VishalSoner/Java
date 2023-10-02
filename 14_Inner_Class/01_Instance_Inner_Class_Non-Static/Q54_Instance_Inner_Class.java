class Q54_Instance_Inner_Class
{
	class A
	{
		void show()
		{
			System.out.println("Show Method");
		}
	}
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/*

 error: non-static variable this cannot be referenced from a static context
                A a = new A();
                      ^

--------------------------------------------------------------------------------------
*/







