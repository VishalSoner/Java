import java.io.*;

class Q16_File_Class_createNewFile
{
	public static void main( String args[]) throws IOException
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo3.txt");
		
		boolean b1 = f1.createNewFile();
		if( b1 )
			System.out.println("Yes ");
		else 
			System.out.println("No");
	}
}

/*
// 01 1st time Run
Yes

// 02 2st time Run
No


.createNewFile() : its return Boolean. To Create the file/folder  if path set data file not created then 
				   Create a file return true,  if already avilable then return false.
Use to check file is Created or not.

----------------------------------------
*/







