class A
{
	void show(int x, int y)
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void show(int x, int y)
	{
		System.out.println("Class B");
	}
}
class Q09_Polymorphism__OverRiding
{
	public static void main(String args[])
	{
		B b = new B();
		
		b.show(10, 20);
	}
}

/* 
Output :- 

Class B
--------------------------------------------------------------------------------------------- 
*/




