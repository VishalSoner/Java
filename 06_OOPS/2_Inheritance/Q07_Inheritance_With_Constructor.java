class A
{}

class B extends A
{
	B(int x, int y)
	{
		System.out.println("Sub : " + (x-y) );
	}
}

class Q07_Inheritance_With_Constructor
{
	public static void main(String args[])
	{
		B b = new B(100, 20);
	}	
}




/* 
 
*/
// ------------------------------------------------------------------------------------------------








