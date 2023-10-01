import java.io.*;

class Q28_FileReader
{
	public static void main( String args[]) throws IOException
	{
		FileReader fr = new FileReader("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		char c[] = new char[30];
		fr.read(c);
		
		for( char c1 : c)
		{
			System.out.print(c1);
		}
		
		fr.close();
	}
}

/*
Hello Vishal Soner
Writing the



Ye Data ko Read ke Liye use karte he.
----------------------------------------
*/







