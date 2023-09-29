import java.io.*;

class Q22_FileInputSteam_available
{
	public static void main( String args[]) throws IOException
	{
		FileInputStream fs  =  new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		int len = fs.available();
		
		byte b[] = new byte[len];
		
		fs.read(b);
		
		String s = new String(b);
		
		System.out.print( s );

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







