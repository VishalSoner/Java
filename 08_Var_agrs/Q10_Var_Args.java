// •	There can be only one variable argument in the method.
// •	Variable argument (varargs) must be the last argument.


class A
{
	void sum(int []a)
	{}
	
	void sum(int ...a)
	{}
	
}

class Q10_Var_Args
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

Q10_Var_Args.java:10: error: cannot declare both sum(int...) and sum(int[]) in A
        void sum(int ...a)
             ^
-------------------------------------------------------------------
*/




