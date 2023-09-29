import java.io.*;

class Q09_File_Class_mkdir
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Vishal Soner");
		
		boolean b1 = f1.mkdir();
		if( b1 )
		{
			System.out.println("Folder Created");
		}
		else 
		{
			System.out.println("Folder Already Exit");
		}
	}
}

/*
// 01  run		true
Folder Created


// 02 run		false.
Folder Already Exit


D:/2_All_Code/02_Input_Output_File_Handling(Stream)/(Vishal Soner)
Vishal Soner Folder  :  1st time folder create return true, 2nd time return false,


.mkdir() : its return Boolean. Folder Created return true, otherwise return false.

Use to Create Folder.


----------------------------------------
*/







