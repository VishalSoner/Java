class A
{
	class B
	{
		abstract void show();
	}
}

class Q51_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
	}
}

/*

error: A.B is not abstract and does not override abstract method show() in A.B
        class B
        ^

--------------------------------------------------------------------------------------
*/







