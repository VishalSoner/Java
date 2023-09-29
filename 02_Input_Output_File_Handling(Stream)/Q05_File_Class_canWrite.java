import java.io.*;

class Q05_File_Class_canWrite
{
	public static void main( String args[])
	{
		File f = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");

		System.out.println( f.canWrite() );
	}
}

/*

true

.canWrite() return boolean value if we can write in file it Return true otherwise false.

----------------------------------------
*/







