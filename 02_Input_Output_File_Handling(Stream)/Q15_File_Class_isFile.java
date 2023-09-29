import java.io.*;

class Q15_File_Class_isFile
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		
		boolean b1 = f1.isFile();
		if( b1 )
			System.out.println("Yes ");
		else 
			System.out.println("No");

		
		File f2 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		boolean b2 = f2.isFile();
		if( b2 )
			System.out.println("Yes ");
		else 
			System.out.println("No");

		
	}
}

/*

No
Yes


.isFile() : its return Boolean. To check the file/folder  if path set data is file return true,  otherwise return false.
Use to check the file or not.

----------------------------------------
*/







