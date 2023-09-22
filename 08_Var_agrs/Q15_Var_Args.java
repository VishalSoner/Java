class A
{
	void show(int ...a)
	{
		System.out.println("var Args Lower");
	}

	void show(int a)
	{
		System.out.println("var Args Higher");
	}
	
}

class Q15_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show(10);
		a.show(10, 20);
		a.show(10, 20, 30);
	}
}

/* 
Output :- 

var Args Higher
var Args Lower
var Args Lower
-------------------------------------------------------------------
*/




