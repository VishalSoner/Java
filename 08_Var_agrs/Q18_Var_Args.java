//We can pass 2'D Array in This Type.

class A
{
	void show(int[] ...a)
	{
		System.out.println("var Args");
	}
}

class Q18_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();

		int x[][] = { {10, 20, 30},
					  {40, 50, 60}  };
		a.show(x);
	}
}

/* 
Output :- 

var Args
-------------------------------------------------------------------
*/




