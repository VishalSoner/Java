interface Inter1
{
	void show();
}

class A implements Inter1
{
	public void show()
	{
		System.out.println("Vishal Soner");
	}
}

class Q23_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
Vishal Soner
-----------------------------------------------------------------------------------------------
*/




