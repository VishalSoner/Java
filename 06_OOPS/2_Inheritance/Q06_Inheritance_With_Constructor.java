class A
{
	int x, y;
	
	A(int x, int y)
	{
		System.out.println("Sum : " + (x+y) );
	}
}
class B extends A
{
	B(int x, int y)
	{
		System.out.println("Sub : " + (x-y) );
	}
}

class Q06_Inheritance_With_Constructor
{
	public static void main(String args[])
	{
		B b = new B(10, 20);
	}	
}




/* 
 constructor A in class A cannot be applied to given types;
 
*/
// ------------------------------------------------------------------------------------------------








