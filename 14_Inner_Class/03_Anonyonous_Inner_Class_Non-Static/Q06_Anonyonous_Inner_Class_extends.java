abstract class A 
{
	abstract void show();
}

class B extends A 
{
	
}

class Q06_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		B b = new B();
		System.out.println("Main Method");
	}
}

/* 

error: B is not abstract and does not override abstract method show() in A
class B extends A
^


-----------------------------------------------------------------------------------------------
*/




