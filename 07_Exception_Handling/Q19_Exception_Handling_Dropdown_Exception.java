import java.io.*;

class Q19_Exception_Handling_Dropdown_Exception
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
		try
		{
			show2();
		}
		catch( Exception e)
		{
			System.out.println("Show2 Exception");
		}
		System.out.println("Show - 1.2");
	}
	public static void main(String args[])
	{
		System.out.println("Vishal Soner - 1");
		
		Q19_Exception_Handling_Dropdown_Exception q19 = new Q19_Exception_Handling_Dropdown_Exception();
		q19.show1();
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

Vishal Soner - 1
Show - 1.1
Show - 2.1
Show2 Exception
Show - 1.2
Vishal Soner - 2
---------------------------------------------------------------------------------------------
*/




