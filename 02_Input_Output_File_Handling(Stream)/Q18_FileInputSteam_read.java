import java.io.*;

class Q18_FileInputSteam_read
{
	public static void main( String args[]) throws IOException
	{
		FileInputStream fs  =  new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		
		while( true )
		{
			int n = fs.read();
			
			if(-1 == n)
				break;
			
			System.out.print( n + "  " );
		}
		fs.close();
	}
}

/*

86   105  115  104  97  108  32  83  111  110  101  114  32   45  32   48  49   13   10   86  105  115  104  97  108  32  83  111  110  
101  114  32   45   32  48   50  13  10   86   105  115  104  97  108  32  83  111  110  101  114




Step - 01 :	Open the steram.
FileInputStream fs = new FileInputStream("Path");

Step - 02 :	read the data.
fs.read();

Step - 03 :	Close the steram.
fs.close();


----------------------------------------
*/







