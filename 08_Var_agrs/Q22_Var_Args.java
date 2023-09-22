class A
{
	void show(int[] ...a)
	{
		System.out.println("Vishal Soner");
	} 	
	
}

class Q22_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		int x[] = {10, 20};
		int y[] = {30, 40};
		
		a.show(x, y);
	}
}

/* 
Output :- 

Vishal Soner
-------------------------------------------------------------------
*/




