interface Inter1
{
	int x = 10;
}

class A implements Inter1
{
	public void show()
	{
		System.out.println("X  :  " + x);
	}
}

class Q06_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

X  :  10

--------------------------------------------------------------------------------------------- 
*/




