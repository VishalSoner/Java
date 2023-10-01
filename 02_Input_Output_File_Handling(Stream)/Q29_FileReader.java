import java.io.*;

class Q29_FileReader
{
	public static void main( String args[]) throws IOException
	{
		FileReader fr = new FileReader("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		
		while( true )
		{
			int n = fr.read();
			if(n == -1)
				break;
			System.out.print( (char)n );
		}
		
		fr.close();
	}
}

/*
Hello Vishal Soner
Writing the Duplicate Data
----------------------------------------
*/







