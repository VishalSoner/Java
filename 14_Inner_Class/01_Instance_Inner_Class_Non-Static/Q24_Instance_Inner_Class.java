/* 
	1. Hum Outer class ko Private nai Bana sakte he.
	2. Inner Class ko Private Kar sakte he.
	
	Outer Class Will be : default, public, final, abstract, starictfe
	Inner Class Will be : Outer 5 +  private, static, protected
*/

private class A
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


class Q24_Instance_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
 
error: modifier private not allowed here
private class A
        ^
Q24_Instance_Inner_Class.java:28: error: cannot find symbol
                a.show();
                 ^
--------------------------------------------------------------------------------------
*/







