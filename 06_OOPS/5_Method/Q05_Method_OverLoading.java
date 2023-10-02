class A
{
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
}

class Q05_Method_OverLoading
{
	public static void main(String args[])
	{
		// 01
		A a = new A();
		a.show();

		// 02
		B b = new B();
		b.show();
		
		// 03
		A a1 = new B();
		a1.show();
		
	}
}

/* 
Output :- 

// 01
Class A

// 02
Class A

// 03
Class A

--------------------------------------------------------------------------------------------- 
*/




