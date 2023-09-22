class A
{
	void sum(int a)
	{
		System.out.println("Sum : " + a);
	}

	void sum(int a, int b)
	{
		System.out.println("Sum : " + (a+b) );
	}
	

	void sum(int a, int b, int c)
	{
		System.out.println("Sum : " + (a+b+c) );
	}
	
	
}

class Q02_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		a.sum(10);
		a.sum(10, 20);
		a.sum(10, 20, 30);
		a.sum(10, 20, 30, 40);
	}
}

/* 
Output :- At a Compile time.

no suitable method found for sum(int,int,int,int)
	a.sum(10, 20, 30, 40);
	 ^
-------------------------------------------------------------------
*/




