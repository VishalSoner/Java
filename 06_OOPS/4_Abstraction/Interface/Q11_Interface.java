interface Inter1
{
	int x = 100;
}

interface Inter2
{
	int x = 200;
}

class A implements Inter1, Inter2
{
	public void show()
	{
		System.out.println("X  :  " + x);
	}
}

class Q11_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: reference to x is ambiguous
    System.out.println("X  :  " + x);
								  ^
--------------------------------------------------------------------------------------------- 
*/




