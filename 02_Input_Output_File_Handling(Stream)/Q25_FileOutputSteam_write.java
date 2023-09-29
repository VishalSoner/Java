import java.io.*;

class Q25_FileOutputSteam_write
{
	public static void main( String args[]) throws IOException
	{
		FileOutputStream  fs  =  new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		String s1 = "Hello Vishal Soner, This is my Account";
		
		byte b1[] = s1.getBytes();
		fs.write(b1);
		
		fs.close();

		
		FileInputStream fi = new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		byte b2[] = new byte[fi.available()];
		fi.read(b2);
		String s2 = new String(b2);
		
		System.out.println( s2 );
		System.out.println( "Done" );
		
		fi.close();
	}
}

/*

Hello Vishal Soner, This is my Account
Done






.write();			:    Add All 
.write( byte[] );   :    Add All 
.write( byte[] , int start, int end); Add 

----------------------------------------
*/







