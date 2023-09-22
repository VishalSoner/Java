class A
{
	void show(int ...a)
	{
		System.out.println("Integer");
	}
	
	void show(String ...a)
	{
		System.out.println("String");
	}
	
	void show(boolean ...a)
	{
		System.out.println("Boolean");
	}
}

class Q14_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show();
	}
}

/* 
Output :- 

Q14_Var_Args.java:25: error: reference to show is ambiguous
                a.show();
                 ^
-------------------------------------------------------------------
*/




