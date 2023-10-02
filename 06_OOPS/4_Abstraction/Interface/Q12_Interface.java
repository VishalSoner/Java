interface Inter1
{
	void show();
}

interface Inter2
{
	void show();
}

class A implements Inter1, Inter2
{
	public void show()
	{
		System.out.println("Show Method");
	}
}

class Q12_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Show Method

--------------------------------------------------------------------------------------------- 
*/




