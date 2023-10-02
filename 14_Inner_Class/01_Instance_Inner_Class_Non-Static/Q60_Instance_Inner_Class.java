class A	
{
	static class B
	{
		public static void main( String args[])
		{
			System.out.println("Main Class - 2");
		}
	}
}

class Q60_Instance_Inner_Class
{
	public static void main( String args[])
	{
		System.out.println("Main Class - 1");
		
		A a = new A();
		
		A.B b = new A.B();
		
	}
}

/*

Compile : javac Q60_Instance_Inner_Class.java

// 01  :  Run java Q60_Instance_Inner_Class
Main Class - 1


// 02  :  Run java A$B
Main Class - 2


// 03  :  Run java A
Error: Main method not found in class A, please define the main method as:




After Compile :
A.class
A$B.class
Q60_Instance_Inner_Class.class

--------------------------------------------------------------------------------------
*/







