import java.io.*;


class Q26_Exception_Handling_Propogation
{
	static void show2() throws FileNotFoundException
	{
		System.out.println("Show - 2.1");
		PrintWriter pw = new PrintWriter("A.txt");
		pw.print("Vishal Soner");
		
		
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
		show1();
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :	(At a Run Time)

error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                show2();
---------------------------------------------------------------------------------------------
*/




