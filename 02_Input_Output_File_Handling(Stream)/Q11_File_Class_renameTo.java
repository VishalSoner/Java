import java.io.*;

class Q11_File_Class_renameTo
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		File f2 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal");
		
		boolean b1 = f1.renameTo(f2);
		if( b1 )
		{
			System.out.println("Folder Name Changed");
		}
		else 
		{
			System.out.println("Folder Name Already Changed");
		}
	}
}

/*
// 01  run		true
Folder Name Changed


// 02 run		false.
Folder Name Already Changed


D:/2_All_Code/02_Input_Output_File_Handling(Stream)/(Vishal Soner)
Vishal Soner Folder  :  1st time folder rename ho gya to return true, 2nd time return false,


.renameTo() : its return Boolean. Folder Renamed return true, otherwise return false.

Use to rename the Folder.


----------------------------------------
*/







