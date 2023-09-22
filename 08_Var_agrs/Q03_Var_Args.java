class A
{
	void sum(int ...a)
	{
		System.out.println("Class A");
	}
}

class Q03_Var_Args
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

Class A
Class A
Class A
Class A

-------------------------------------------------------------------
*/




