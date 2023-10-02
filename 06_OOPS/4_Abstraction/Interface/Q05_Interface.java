interface Inter1
{
	void show();
}

class A implements Inter1
{
	public void show()
	{
		System.out.println("Class A");
	}
}

class Q05_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Class A
--------------------------------------------------------------------------------------------- 
*/




