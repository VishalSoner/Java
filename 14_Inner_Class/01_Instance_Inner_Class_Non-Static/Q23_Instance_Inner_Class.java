/* 
	Outer Class Ke Private Data Ko inner Class ke Ander use kar sakte he 
*/

class A
{
	private int x = 10;
	
	class B
	{
		void show()
		{
			System.out.println ("X : " + x);
		}
	}
}


class Q23_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
 
X : 10

--------------------------------------------------------------------------------------
*/







