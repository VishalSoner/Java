class A
{
	void show(int ...a)
	{
		System.out.println("Integer");
	}
}

class Q12_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show();
	}
}

/* 
Output :- 

Integer
           ^
-------------------------------------------------------------------
*/




