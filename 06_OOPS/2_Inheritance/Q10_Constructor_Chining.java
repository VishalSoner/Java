class A
{
	A(int x, int y)
	{
		System.out.println( "Sum : " + (x+y) );
	}
}

class B extends A
{
	B(int x, int y)
	{
		super(x, y);
		System.out.println( "Sub : " + (x-y) );
	}
}

class Q10_Constructor_Chining
{
	public static void main(String args[])
	{
		B b = new B(100, 20);
	}	
}




/* 
Sum : 120
Sub : 80
*/
// ------------------------------------------------------------------------------------------------








