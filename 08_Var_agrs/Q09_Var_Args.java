class A
{
	void sum(int []a)
	{
		int count = 0;
		
		for(int i : a)
		{
			count += i;
		}

		System.out.println("Sum : " + count);
	}
	
}

class Q09_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		int x[] = {10, 20, 30, 40};
		int y[] = {1, 2, 3, 4};
		a.sum(x);
		a.sum(y);
	}
}

/* 
Output :- 

Sum : 100
Sum : 10

-------------------------------------------------------------------
*/




