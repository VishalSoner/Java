class A
{
	void sum(int x, int ...a)
	{
		int count = 0;
		for(int i : a)
		{
			count += i;
		}
		System.out.println("Sum : " + count);
	}
	
}

class Q07_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		a.sum(10);
		a.sum(10, 20);
		
		a.sum();
	}
}

/* 
Output :- 

 error: method sum in class A cannot be applied to given types;
                a.sum();
                 ^
-------------------------------------------------------------------
*/




