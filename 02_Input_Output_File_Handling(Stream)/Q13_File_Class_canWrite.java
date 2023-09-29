import java.io.*;

class Q13_File_Class_canWrite
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		
		boolean b1 = f1.canWrite();
		if( b1 )
		{
			System.out.println("Yes ");
		}
		else 
		{
			System.out.println("No");
		}
	}
}

/*

Yes


.canWrite() : its return Boolean. when we can write in file/folder return true otherwise return false.
Use to check we can write or not.

----------------------------------------
*/







