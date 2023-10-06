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

class Q08_Method_Chaining
{
	public static void main(String args[])
	{
		A a = new A().show1();
	}
}
/* 
error: incompatible types: void cannot be converted to A
                A a = new A().show1();
                                   ^
--------------------------------------------------------------------------------------------- 
*/




