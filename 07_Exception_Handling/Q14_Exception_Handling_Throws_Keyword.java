import java.io.*;

class Q14_Exception_Handling_Throws_Keyword
{
	public static void main(String args[])
	{
		System.out.println("Vishal Soner - 1");
		
		PrintWriter pw = new PrintWriter("A.txt");
		pw.print("Vishal Soner");
		
		System.out.println("Vishal Soner - 2");
	}
}

/*
input :

error:  unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("A.txt");
						 ^
---------------------------------------------------------------------------------------------
*/




