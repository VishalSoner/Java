interface Inter1
{
	static void show()
	{
		System.out.println("Static Method Interface Inter1");
	}	
}

class A implements Inter1
{
	void show()
	{
		Inter1.show();
		System.out.println("Class A Show Method");
	}
}

class Q19_Interface_Default_Method
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Class A Show Method

--------------------------------------------------------------------------------------------- 
*/
