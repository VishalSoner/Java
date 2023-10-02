class A	
{
	class B
	{
		public static void main( String args[])
		{
			System.out.println("Main Class - 2");
		}
	}
}

class Q61_Instance_Inner_Class
{
	public static void main( String args[])
	{
		System.out.println("Main Class - 1");
		
		A a = new A();
		
		A.B b = new A.B();
		
	}
}

/*

Compile : javac Q61_Instance_Inner_Class.java

error: Illegal static declaration in inner class A.B
                public static void main( String args[])
                                   ^
  modifier 'static' is only allowed in constant variable declarations
Q61_Instance_Inner_Class.java:20: error: an enclosing instance that contains A.B is required
                A.B b = new A.B();
                        ^
--------------------------------------------------------------------------------------
*/







