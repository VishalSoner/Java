abstract class A
{
	abstract void show();
}

abstract class B extends A
{
}

class Q10_Abstraction_Method
{
	public static void main(String args[])
	{
		B b = new B();
		System.out.println("Done");
	}
}

/* 

 error: B is abstract; cannot be instantiated
                B b = new B();
                      ^
					  
------------------------------------------------------------------------------------------ 
*/





