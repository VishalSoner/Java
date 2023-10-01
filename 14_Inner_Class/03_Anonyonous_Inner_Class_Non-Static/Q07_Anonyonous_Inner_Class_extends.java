abstract class A 
{
	abstract void show();
}

class B extends A 
{
	void show()
	{
		System.out.println("Class B show Method");
	}
	
}

class Q07_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
		System.out.println("Main Method");
	}
}

/* 

Class B show Method
Main Method


-----------------------------------------------------------------------------------------------
*/




