/*
	Interface Ke Andar Interface Bana sakte he.
*/
interface A
{
	void show1();
	interface Inter1
	{
		void show2();
	}
}

class B1 implements A
{
	public void show1()
	{
		System.out.println("Show Method - 1");
	}
}

class B2 implements A.Inter1
{
	public void show2()
	{
		System.out.println("Show Method - 2");
	}
}

class Q23_Interface_WithIn_Interface
{
	public static void main(String args[])
	{
		B1 b1 = new B1();
		b1.show1();
		
		B2 b2 = new B2();
		b2.show2();
	}
}

/* 

Show Method - 1
Show Method - 2

--------------------------------------------------------------------------------------------- 
*/




