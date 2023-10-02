abstract class A
{
	void show()
	{
		System.out.println("Abstract Class Show Method");
	}
}

class B extends A
{}

class Q21_Abstraction_Class_Reference_Variable
{
	public static void main(String args[])
	{
		A a = new B();
		a.show();
		System.out.println("Done");
	}
}

/* 

Abstract Class Show Method
Done


------------------------------------------------------------------------------------------ 
*/





