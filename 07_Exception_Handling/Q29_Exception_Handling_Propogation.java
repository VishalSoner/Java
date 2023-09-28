import java.io.*;


class Q29_Exception_Handling_Propogation
{
	static void show2() throws FileNotFoundException
	{
		System.out.println("Show - 2.1");
		try
		{
			PrintWriter pw = new PrintWriter("A.txt");
			pw.print("Vishal Soner");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		
		System.out.println("Show - 2.2");
	}
	
	static void show1() throws FileNotFoundException
	{
		System.out.println("Show - 1.1");
		show2();
		System.out.println("Show - 1.2");
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		System.out.println("Vishal Soner - 1");
		show1();
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :	

Vishal Soner - 1
Show - 1.1
Show - 2.1
Show - 2.2
Show - 1.2
Vishal Soner - 2

---------------------------------------------------------------------------------------------
*/




