import java.io.*;

class Q15_Exception_Handling_Throws_Keyword
{
	public static void main(String args[]) throws FileNotFoundException
	{
		System.out.println("Vishal Soner - 1");
		
		PrintWriter pw = new PrintWriter("A.txt");
		pw.print("Vishal Soner");
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

Vishal Soner - 1
Vishal Soner - 2
---------------------------------------------------------------------------------------------
*/




