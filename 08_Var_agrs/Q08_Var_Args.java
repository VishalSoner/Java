class A
{
	void sum(int ...a, int ...b)
	{
		System.out.println("Class A");
	}
	
}

class Q08_Var_Args
{
	public static void main(String args[])
	{
		A a = new A();
		a.sum(10);
		a.sum(10, 20);
		a.sum(10, 20, 30);
	}
}

/* 
Output :- 

Q08_Var_Args.java:3: error: ')' expected
        void sum(int ...a, int ...b)
                         ^
Q08_Var_Args.java:3: error: <identifier> expected
        void sum(int ...a, int ...b)
                              ^
Q08_Var_Args.java:3: error: <identifier> expected
        void sum(int ...a, int ...b)
-------------------------------------------------------------------
*/




