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

class Q11_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show(10, 20, 30);
		a.show("A", "B", "C");
		a.show(true, false, true, false);
	}
}

/* 
Output :- 

Integer
String
Boolean
           ^
-------------------------------------------------------------------
*/




