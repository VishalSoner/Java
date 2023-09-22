//We can pass Array and multiple args. in var args

class A
{
	void show(int ...a)
	{
		System.out.println("var Args");
	}
}

class Q16_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		a.show(10, 20, 30);
		
		int x[] = {10, 20, 30};
		a.show(x);
	}
}

/* 
Output :- 

var Args
var Args
-------------------------------------------------------------------
*/




