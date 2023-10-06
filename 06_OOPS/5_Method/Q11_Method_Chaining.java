class A
{
	A show1()
	{
		System.out.println("Show - 1");
		return new A();
	}
	
	void show2()
	{
		System.out.println("Show - 2");
	}
	
}

class Q11_Method_Chaining
{
	public static void main(String args[])
	{
		new A().show1().show2();
	}
}
/* 
Show - 1
Show - 2
--------------------------------------------------------------------------------------------- 
*/




