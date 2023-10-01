import java.io.*;

class Q37_ObjectInputStream
{
	public static void main( String args[]) throws Exception
	{
		FileInputStream fs1 = new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		ObjectInputStream os1 = new ObjectInputStream(fs1);
		
		pkg.Game g2 = (pkg.Game)os1.readObject(); 
		g2.display_Data();
		
		fs1.close();
		os1.close();
	}
}

/*
// 1st Time Compile :
-------------------
| Id      : 10    |
| Name    : 20    |
| Age     : 30    |
| Contact : 40    |
-------------------
------------------------------------------------------
*/

