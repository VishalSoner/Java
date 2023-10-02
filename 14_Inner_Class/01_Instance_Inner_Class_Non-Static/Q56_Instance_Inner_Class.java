class Q56_Instance_Inner_Class
{
	static class A
	{
		static int x = 100;
		static void show()
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

show Method


Ham Static Class ke andar Static variable and Method bana sakte he,
But 
Static Method ke andara Static Variable Nai bana sakte.
--------------------------------------------------------------------------------------
*/







