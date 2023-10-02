class Q59_Instance_Inner_Class
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
		
		Q59_Instance_Inner_Class.A  a  = new  Q59_Instance_Inner_Class.A();
		
		//if We Call Main method Implicitly It can't Allow.
		a.main();
		
	}
}

/*
error: method main in class A cannot be applied to given types;
                a.main();
                 ^
--------------------------------------------------------------------------------------
*/







