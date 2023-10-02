/*
	Class Ke Andar Interface Bana sakte he.
*/
class A 
{
	interface Inter1
	{
		void show();
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("Show Method");
	}
}

class Q22_Class_WithIn_Interface
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
	}
}

/* 

Show Method

--------------------------------------------------------------------------------------------- 
*/

