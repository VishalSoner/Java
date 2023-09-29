abstract class A
{
	abstract void show();
}

class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}

class Q11_Abstraction_Method
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
		System.out.println("Done");
	}
}

/* 

Class B
Done
------------------------------------------------------------------------------------------ 
*/





