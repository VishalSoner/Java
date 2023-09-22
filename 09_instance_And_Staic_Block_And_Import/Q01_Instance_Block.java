// when class Object is Created instance block will be excuted , Constructor ke pahle run hoga
class A
{
	// instance block
	{	
		System.out.println("Instance block");
	}
	A()
	{
		System.out.println("A Constructor");
	}
}

class Q01_Instance_Block
{
	public static void main(String args[])
	{
		A a1 = new A();
	}
}
 
/* 
Output :- 
Instance block
A Constructor

------------------------------------------------
*/
