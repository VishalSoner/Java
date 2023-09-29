import java.io.*;

class Q07_File_Class_lastModified
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo1.txt");
		
		//01
		long time = f1.lastModified();
		System.out.println( time );
		
		// 02
		java.util.Date date = new java.util.Date( time );
		System.out.println( date );
		
	}
}

/*
// 01
1695983179011

// 02
Fri Sep 29 15:56:19 IST 20231


.lastModified() : return Date when over file is modified.

----------------------------------------
*/







