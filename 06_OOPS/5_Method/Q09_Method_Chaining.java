class A
{
	void show1()
	{
		System.out.println("Show - 1");
	}

	void show2()
	{
		System.out.println("Show - 2");
	}
}

class Q09_Method_Chaining
{
	public static void main(String args[])
	{
		new A().show1().show2();
	}
}
/* 
 error: void cannot be dereferenced
	new A().show1().show2();
	                ^
--------------------------------------------------------------------------------------------- 
*/




