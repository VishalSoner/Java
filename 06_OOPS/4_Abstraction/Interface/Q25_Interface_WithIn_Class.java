/*
	Interface Ke Andar Class Bana sakte he.
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

class B implements Inter1
{}

class Q25_Interface_WithIn_Class
{
	public static void main(String args[])
	{
		// 01
		// B b1 = new B();
		// b1.show1();
		
		// 02
		// A.B b2 = new A.B();
		// b2.show1();
		
		// 03
		B.A b3 = new B.A();
		b3.show1();
	}
}

/* 

// 01
 error: cannot find symbol
    b1.show();
    ^

// 02
error: cannot find symbol
    A.B b2 = new A.B();
     ^

// 03
Show - 1

--------------------------------------------------------------------------------------------- 
*/




