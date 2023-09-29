/*
	For Reading  : the file must exists.
	For Writeing : 1. if file is available then the contents you are writing will overwrite the existing data.
				   2. if file is not available so new file created And then data will be store to new file.
*/


import java.io.*;

class Q23_FileOutputSteam_write
{
	public static void main( String args[]) throws IOException
	{
		FileOutputStream  fs  =  new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		fs.write(97);
		fs.write(98);
		fs.write(99);
		fs.write(100);
		fs.write(101);
		fs.write(102);
		fs.close();

		
		FileInputStream fi = new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		byte b[] = new byte[fi.available()];
		fi.read(b);
		String s = new String(b);
		
		System.out.println( s );
		System.out.println( "Done" );
		
		fi.close();
	}
}

/*

abcd



...FileOutputStream("path");
Parameter me true nai denge to data overRide ho jayega.(All Remove new Insert).


...FileOutputStream("path", true);
Parameter me true denge to data store(concat) ho jayega.(Without delete any data).
.write(data);



Step - 01 :	Open the steram.
FileOutputStream fs = new FileOutputStream("Path");

Step - 02 :	Write the data.
fs.write();

Step - 03 :	Close the steram.
fs.close();


----------------------------------------
*/







