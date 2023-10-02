class Q58_Instance_Inner_Class
{
	static class A
	{
		public static void main( String args[])
		{
			System.out.println("Main Class - 2");
		}
	}
	public static void main( String args[])
	{
		System.out.println("Main Class - 1");
		
		A a = new A();
		
		//if We Call Main method Implicitly It can't Allow.
		// a.main()
		
	}
}

/*
Compile : javac Q58_Instance_Inner_Class.java


// 01		Run : java Q58_Instance_Inner_Class
Main Class - 1


// 02		Run : java Q58_Instance_Inner_Class$A
Main Class - 2



After Comepile
Q58_Instance_Inner_Class.class
Q58_Instance_Inner_Class$A.class
--------------------------------------------------------------------------------------
*/







