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
}

class C extends B
{
}

class Q14_Abstraction_Method
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

error: B is not abstract and does not override abstract method show2() in A
class B extends A
^
------------------------------------------------------------------------------------------ 
*/





