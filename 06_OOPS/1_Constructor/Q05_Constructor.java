class A
{
	A()
	{
		System.out.println("Class A");
	}
	void show()
	{
		System.out.println("Show Class A");
	}	
}

class Q05_Constructor
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
		
		a1.show();
		a2.show();
	}
}

/* 

Class A
Class A
Show Class A
Show Class A
--------------------------------------------------------------------------------------------- 
*/




