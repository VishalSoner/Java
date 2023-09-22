class A
{
	int count;
	void sum(int ...a)
	{
		for(int i : a)
		{
			count += i;
		}
		System.out.println("Sum : " + count);
	}
	
}

class Q05_Var_Args
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

Sum : 10
Sum : 30
Sum : 60
Sum : 100

-------------------------------------------------------------------
*/




