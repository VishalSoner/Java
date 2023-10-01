import java.io.*;

class Q27_FileWriter
{
	public static void main( String args[]) throws IOException
	{
		// FileWriter fw = new FileWriter("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		FileWriter fw = new FileWriter("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt", true);
		
		fw.write("Hello Vishal Soner\n");
		fw.write("Writing the Duplicate Data");
		
		fw.close();
		System.out.println("Done");
	}
}

/*

Done



Ye Data ko Insert ke karega + Old Data ko delete kar dega.



FileWriter fw = new FileWriter("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt",  true);

Yadi Parameter me true pass kar de to Old data Delete nai hoga + Data insert ho jayega.
----------------------------------------
*/







