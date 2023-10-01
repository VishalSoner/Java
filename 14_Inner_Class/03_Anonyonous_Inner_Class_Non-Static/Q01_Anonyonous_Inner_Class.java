abstract class A 
{
	void show()
	{
		System.out.println("Vishal Soner - 1");
	}
}


class Q01_Anonyonous_Inner_Class
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: A is abstract; cannot be instantiated
                A a = new A();
                      ^

-----------------------------------------------------------------------------------------------
*/



