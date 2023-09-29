import java.io.*;

class Q19_FileInputSteam_read
{
	public static void main( String args[]) throws IOException
	{
		FileInputStream fs  =  new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		
		while( true )
		{
			int n = fs.read();
			
			if(-1 == n)
				break;
			
			System.out.print( (char)n);
		}
		
		fs.close();
	}
}

/*

Vishal Soner - 01
Vishal Soner - 02
Vishal Soner - 03
Vishal Soner - 04
Vishal Soner - 05

----------------------------------------
*/







