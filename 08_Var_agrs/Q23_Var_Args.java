class A
{
	void show(int ...a)
	{
		System.out.println("Only var args");
	}

	void show(int[] ...a)
	{
		System.out.println("Array + var args");
	} 	
	
}

class Q23_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		int a1 = 10, b1 = 20;
		a.show(a1, b1);
		
		int x[] = {10, 20};
		int y[] = {30, 40};
		a.show(x, y);
		
		int x1[][] = {	{10, 20}, {30, 40}	};
		
		a.show(x1);
	}
}

/* 
Output :- 

Only var args
Array + var args
Array + var args
-------------------------------------------------------------------
*/




