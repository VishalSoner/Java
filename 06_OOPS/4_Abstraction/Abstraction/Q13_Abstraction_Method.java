abstract class A
{
	abstract void show1();
	abstract void show2();
}

class B extends A
{
	void show1()
	{
		System.out.println("Class B Show1");
	}

	void show2()
	{
		System.out.println("Class B Show2");
	}
}

class Q13_Abstraction_Method
{
	public static void main(String args[])
	{
		B b = new B();
		b.show1();
		b.show2();
		System.out.println("Done");
	}
}

/* 

Class B Show1
Class B Show2
Done

------------------------------------------------------------------------------------------ 
*/





