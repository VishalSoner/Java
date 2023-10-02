/*
	Yah Class A ko inherite kiy he na ki interface ko.
*/
interface Inter1
{
	class A
	{
		void show1()
		{
			System.out.println("Show Method - 1");
		}
	}
}

class B extends Inter1.A
{}

class Q26_Interface_WithIn_Class
{
	public static void main(String args[])
	{
		// 01
		B b1 = new B();
		b1.show1();
	}
}

/* 

// 01
Show - 1

--------------------------------------------------------------------------------------------- 
*/




