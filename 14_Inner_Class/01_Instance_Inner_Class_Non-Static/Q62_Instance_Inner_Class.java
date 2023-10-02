/*
Java Not Allow to Create Static Method in Inner Class.
Java Allow to Create Static Method in Static Inner Class.

*/

class A	
{
	class B
	{
		static void Show( String args[])
		{
			System.out.println("Show Method");
		}
	}
}

class Q62_Instance_Inner_Class
{
	public static void main( String args[])
	{
		System.out.println("Main Class - 1");
		
		A a = new A();
		
		A.B b = new A.B();
		
	}
}

/*


error: Illegal static declaration in inner class A.B
                static void Show( String args[])
                            ^

--------------------------------------------------------------------------------------
*/







