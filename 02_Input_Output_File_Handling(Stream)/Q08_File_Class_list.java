import java.io.*;

class Q08_File_Class_list
{
	public static void main( String args[])
	{
		File f1 = new File("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/");
		
		//01
		String s1[] = f1.list();
		
		for( String s : s1)
		{
			System.out.println( s );
		}
		
	}
}

/*

Demo1.txt
Input_Output_File_Handling(Stream).docx
Input_Output_File_Handling(Stream).txt
Q01_File_Class.java
Q02_File_Class_length.java
Q03_File_Class_exists.java
Q04_File_Class_isHidden.java
Q05_File_Class_canWrite.java
Q06_File_Class_isDirectory.java
Q07_File_Class_lastModified.java
Q08_File_Class_list.class
Q08_File_Class_list.java




.list() : its return String list How many file in Your folder.

----------------------------------------
*/







