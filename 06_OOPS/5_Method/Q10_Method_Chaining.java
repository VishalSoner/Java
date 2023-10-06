class A
{
	int show1()
	{
		System.out.println("Show - 1");
		return 10;
	}

	void show2()
	{
		System.out.println("Show - 2");
	}
}

class Q10_Method_Chaining
{
	public static void main(String args[])
	{
		new A().show1().show2();
	}
}
/* 
  error: int cannot be dereferenced
    new A().show1().show2();
                    ^
--------------------------------------------------------------------------------------------- 
*/




