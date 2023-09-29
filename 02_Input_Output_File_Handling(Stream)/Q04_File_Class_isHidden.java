import java.io.*;

class Q04_File_Class_isHidden
{
	public static void main( String args[])
	{
		File f = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");

		System.out.println( f.isHidden() );
	}
}

/*

false

.isHidden() return boolean value file is hidden or Not. 
If it is hidden Return true otherwise false.


----------------------------------------
*/







