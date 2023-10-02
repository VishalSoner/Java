interface Inter1
{
	int x = 10;
}

class A implements Inter1
{
	public void show()
	{
		int x = 20;
		System.out.println("X  :  " + x);
	}
}

class Q08_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

x = 20;


--------------------------------------------------------------------------------------------- 
*/




