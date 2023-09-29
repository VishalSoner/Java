import java.io.*;

class Q20_FileInputSteam_read
{
	public static void main( String args[]) throws IOException
	{
		FileInputStream fs  =  new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		byte b[] = new byte[10];
		
		fs.read(b);
		
		for( byte i : b)
		{
			System.out.print( i + "  " );
		}

		fs.close();
	}
}

/*

86  105  115  104  97  108  32  83  111  110

----------------------------------------
*/







