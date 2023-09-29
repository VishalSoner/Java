import java.io.*;

class Q06_File_Class_isDirectory
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		System.out.println( f1.isDirectory() );
		
		File f2 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)");
		System.out.println( f2.isDirectory() );

	}
}

/*

true

.isDirectory() return boolean value if File path is file it Return false and when file path is Folder return true.

if file return false.
if folder return true.
----------------------------------------
*/







