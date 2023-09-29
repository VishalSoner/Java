/*
	For Reading  : the file must exists.
	For Writeing : 1. if file is available then the contents you are writing will overwrite the existing data.
				   2. if file is not available so new file created And then data will be store to new file.
*/


import java.io.*;

class Q24_FileOutputSteam_write
{
	public static void main( String args[]) throws IOException
	{
		FileOutputStream  fs  =  new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt", true);
		
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

// 1st Run
abcdef
Done

// 2st Run
abcdefabcdef
Done

// 3st Run
abcdefabcdefabcdef
Done

// 4st Run
abcdefabcdefabcdefabcdef
Done

// 5st Run
abcdefabcdefabcdefabcdefabcdef
Done

-------------

...FileOutputStream("path");
Parameter me true nai denge to data overRide ho jayega.(All Remove new Insert).


...FileOutputStream("path", true);
Parameter me true denge to data store(concat) ho jayega.(Without delete any data).
.write(data);

----------------------------------------
*/







