class A
{
	class A 
	{
		void show()
		{
			System.out.println("A - Abstract Show");
		}
	}
}

class Q48_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/*

		
error: class A is already defined in package unnamed package
        class A
        ^

--------------------------------------------------------------------------------------
*/







