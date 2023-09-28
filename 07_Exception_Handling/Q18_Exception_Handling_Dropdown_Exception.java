import java.io.*;

class Q18_Exception_Handling_Dropdown_Exception
{
	static void show2()
	{
		System.out.println("Show - 2.1");
		try
		{
			System.out.println(10/0);
		}
		catch( Exception e)
		{
			System.out.println("Show2 Exception");
		}
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
		
		Q18_Exception_Handling_Dropdown_Exception q18 = new Q18_Exception_Handling_Dropdown_Exception();
		q18.show1();
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

Vishal Soner - 1
Show - 1.1
Show - 2.1
Show2 Exception
Show - 2.2
Show - 1.2
Vishal Soner - 2
---------------------------------------------------------------------------------------------
*/




