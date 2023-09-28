import java.io.*;

class Q17_Exception_Handling_Dropdown_Exception
{
	static void show2()
	{
		System.out.println("Show - 2.1");
		System.out.println(10/0);
		System.out.println("Show - 2.2");
	}
	
	static void show1()
	{
		System.out.println("Show - 1.1");
		show2();
		System.out.println("Show - 1.2");
	}
	public static void main(String args[])
	{
		System.out.println("Vishal Soner - 1");
		
		Q17_Exception_Handling_Dropdown_Exception q17 = new Q17_Exception_Handling_Dropdown_Exception();
		q17.show1();
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

Vishal Soner - 1
Show - 1.1
Show - 2.1
Exception in thread "main" java.lang.ArithmeticException: / by zero

---------------------------------------------------------------------------------------------
*/




