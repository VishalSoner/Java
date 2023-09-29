class A
{
	A()
	{
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance Block");
	}

}


class Q33_Instance_Inner_Class
{
	public static void main( String args[])
	{
		new A();
	}
}

/* 

Instance Block
Constructor
 
--------------------------------------------------------------------------------------
*/







