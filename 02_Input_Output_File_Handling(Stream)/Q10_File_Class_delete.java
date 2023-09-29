import java.io.*;

class Q10_File_Class_delete
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		
		boolean b1 = f1.delete();
		if( b1 )
		{
			System.out.println("Folder Deleted");
		}
		else 
		{
			System.out.println("Folder Already Deleted");
		}
	}
}

/*
// 01  run		true
Folder Deleted


// 02 run		false.
Folder Already Deleted


D:/2_All_Code/02_Input_Output_File_Handling(Stream)/(Vishal Soner)
Vishal Soner Folder  :  1st time folder Deleted return true, 2nd time return false,


.delete() : its return Boolean. Folder Deleted return true, otherwise return false.

Use to Deleted the Folder.


----------------------------------------
*/







