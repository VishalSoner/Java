import java.io.*;

class Q17_FileInputSteam_read
{
	public static void main( String args[]) throws IOException
	{
		FileInputStream fs  =  new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		
		while( true )
		{
			int n = fs.read();
			System.out.print( n + "  " );
		}
		
		
	}
}

/*

-1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  -1  infinity






Step - 01 :	Open the steram.
FileInputStream fs = new FileInputStream("Path");

Step - 02 :	read the data.
fs.read();

Step - 03 :	Close the steram.
fs.close();


----------------------------------------
*/







