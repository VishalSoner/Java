/* 



*/

class A
{
	private int x = 10;
	
	private class B
	{
		void show()
		{
			System.out.println ("X : " + x);
		}
	}
}


class Q25_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		A.B b = a.new B()
		
		b.show();
	}
}

/* 

Private Inner Class
 
--------------------------------------------------------------------------------------
*/







