class A
{
	void show()
	{
		System.out.println("Default Parameter");
	}

	void show(int x)
	{
		System.out.println("One Parameter");
	}

	void show(int x, int y)
	{
		System.out.println("Two Parameter");
	}
}
class Q01_Polymorphism_Overloading
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		a.show(10);
		a.show(10, 20);
	}
}

/* 
Output :- 
Default Parameter
One Parameter
Two Parameter

--------------------------------------------------------------------------------------------- 
*/




