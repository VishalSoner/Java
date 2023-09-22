class A
{
	void show(int ...a)
	{
		System.out.println("Vishal Soner");
	} 	
	
}

class Q20_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		int x = 10, y = 20;
		
		a.show(x, y);
	}
}

/* 
Output :- 

Vishal Soner
-------------------------------------------------------------------
*/




