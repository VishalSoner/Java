import java.io.*;

class A
{
	static void show2()
	{
		System.out.println("Show - 2.1");
		try
		{
			System.out.println(10/0);
		}
		catch( Exception e )
		{
			System.out.println("show2 Catch Block");
		}
		System.out.println("Show - 2.2");
	}
}

class B extends A
{
	static void show1()
	{
		System.out.println("Show - 1.1");
		A.show2();
		System.out.println("Show - 1.2");
	}
}

class Q21_Exception_Handling_Dropdown_Exception
{
	
	public static void main(String args[])
	{
		System.out.println("Vishal Soner - 1");
		
		B.show1();
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

Vishal Soner - 1
Show - 1.1
Show - 2.1
show2 Catch Block
Show - 2.2
Show - 1.2
Vishal Soner - 2
---------------------------------------------------------------------------------------------
*/




