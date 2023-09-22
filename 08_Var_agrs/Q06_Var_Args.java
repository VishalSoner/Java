class A
{
	int count;
	void sum(int ...a, int b)
	{
		for(int i : a)
		{
			count += i;
		}
		System.out.println("Sum : " + count);
	}
	
}

class Q06_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		a.sum(10);
		a.sum(10, 20);
		a.sum(10, 20, 30);
		a.sum(10, 20, 30, 40);
	}
}

/* 
Output :- 

Sum : 0
Sum : 20
Sum : 50
Sum : 90

-------------------------------------------------------------------
*/




